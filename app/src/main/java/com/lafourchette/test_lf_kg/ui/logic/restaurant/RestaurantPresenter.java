package com.lafourchette.test_lf_kg.ui.logic.restaurant;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.lafourchette.test_lf_kg.R;
import com.lafourchette.test_lf_kg.data.model.Restaurant;
import com.lafourchette.test_lf_kg.data.model.helpers.RestaurantHelper;
import com.lafourchette.test_lf_kg.data.network.RestaurantService;
import com.lafourchette.test_lf_kg.ui.Presenter;
import com.lafourchette.test_lf_kg.utils.Constants;

import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

class RestaurantPresenter implements Presenter<RestaurantViewPresenter> {

    private final static String TAG = RestaurantPresenter.class.getSimpleName();

    private RestaurantViewPresenter view;
    private Context context;
    private RestaurantService service;
    private Subscription subscription;

    private Restaurant restaurant;
    private GoogleMap googleMap;
    private boolean offsetState;

    RestaurantPresenter(Context context, RestaurantService service) {
        this.context = context;
        this.service = service;
        this.offsetState = true;
    }

    @Override
    public void attachView(RestaurantViewPresenter view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        this.view = null;
    }

    void initData(Bundle extras) {
        loadRestaurantData("6861");
    }

    private void loadRestaurantData(final String restaurantId) {

        Observable<Restaurant> restaurantResponseObservable = service.getRestaurant(Constants.method_get_restaurant, restaurantId)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());

        subscription = restaurantResponseObservable.subscribe(new Observer<Restaurant>() {
            @Override
            public void onCompleted() {
            }

            @Override
            public void onError(Throwable e) {
                Log.i(TAG, "error");
            }

            @Override
            public void onNext(Restaurant response) {
                Log.i(TAG, response.toString());

                restaurant = response;

                view.displayCoverPicture(response.getPicture().get_612x344());

                view.displayInfoCategory(response.getSpeciality());
                view.displayInfoPrice(String.valueOf(RestaurantHelper.getMinPriceBefore(context, response)));
                view.displayName(response.getName());
                view.displayAddress(RestaurantHelper.getAddress(response));
                view.showRestaurantInfo();

                view.displayPictureNumber(RestaurantHelper.getPictureNumber(context, response));
                view.displayRating(String.valueOf(response.getAvgRate()));
                view.displayOpinionNumber(RestaurantHelper.getReviewCount(context, response));

                view.showPhotoNumberInfo();
                view.showReviewInfo();
                view.showPlanInfo();

                view.setTitle(response.getName());

                LatLng position = new LatLng(response.getGpsLat(), response.getGpsLong());
                MarkerOptions marker = new MarkerOptions()
                        .position(position)
                        .title(response.getName())
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_map_marker_green));
                googleMap.addMarker(marker);
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(position, 15));
            }
        });

    }

    void initMap(GoogleMap googleMap) {
        this.googleMap = googleMap;
        this.googleMap.getUiSettings().setScrollGesturesEnabled(false);
        this.googleMap.getUiSettings().setZoomGesturesEnabled(false);
        this.googleMap.getUiSettings().setTiltGesturesEnabled(false);
        this.googleMap.getUiSettings().setRotateGesturesEnabled(false);
    }

    void selectItemShare() {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_SUBJECT, restaurant.getName());
        sendIntent.putExtra(Intent.EXTRA_TEXT, restaurant.getPortalUrl());
        sendIntent.setType("text/plain");
        context.startActivity(Intent.createChooser(sendIntent, context.getString(R.string.share_restaurant)));
    }

    void selectItemFavorite() {
    }

    void unsubscribeNetworkCalls() {
        if (subscription != null && !subscription.isUnsubscribed())
            subscription.unsubscribe();
    }

    void updateInformationsState(int verticalOffset) {
        if(restaurant != null){
            if (verticalOffset == 0) {
                view.showRestaurantInfo();
                offsetState = false;
            } else if (!offsetState) {
                view.hideRestaurantInfo();
                offsetState = true;
            }
        }
    }
}
