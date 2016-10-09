package com.lafourchette.test_lf_kg.ui.logic.restaurant;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.lafourchette.test_lf_kg.R;
import com.lafourchette.test_lf_kg.RestaurantApplication;
import com.lafourchette.test_lf_kg.data.network.RestaurantService;
import com.lafourchette.test_lf_kg.ui.BaseActivity;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;
import com.nostra13.universalimageloader.core.imageaware.ImageAware;
import com.nostra13.universalimageloader.core.imageaware.ImageViewAware;

public class RestaurantActivity extends BaseActivity implements RestaurantViewPresenter {

    private final static String TAG = RestaurantActivity.class.getSimpleName();

    private RestaurantPresenter presenter;

    private AppBarLayout mAppBarLayout;
    private CollapsingToolbarLayout mCollapsingToolbarLayout;
    private ImageView mImageViewCover;
    private LinearLayout mLinearLayoutInformations;
    private LinearLayout mLinearLayoutReviewContent;
    private TextView mTextViewCategory;
    private TextView mTextViewPrice;
    private TextView mTextViewName;
    private TextView mTextViewAddress;
    private TextView mTextViewPictureNumber;
    private TextView mTextViewRating;
    private TextView mTextViewOpinion;
    private TextView mTextViewPlan;
    private RelativeLayout mRelativeLayoutTabPictures;
    private RelativeLayout mRelativeLayoutTabPlan;
    private SupportMapFragment mSupportMapFragment;
    private DisplayImageOptions displayImageOptions;
    private Animation animationSlideUp;
    private Animation animationFadeIn;
    private Animation animationFadeOut;

    private OnMapReadyCallback onMapReadyCallback = new OnMapReadyCallback() {
        @Override
        public void onMapReady(GoogleMap googleMap) {
            presenter.initMap(googleMap);
        }
    };

    private View.OnClickListener onClickListenerPicturesTab = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

    private View.OnClickListener onClickListenerPlanTab = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_restaurant);

        initView();
        initListeners();
        initData();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.restaurant, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.item_restaurant_share:

                presenter.selectItemShare();
                return true;
            case R.id.item_restaurant_favorite:

                presenter.selectItemFavorite();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();

        presenter.unsubscribeNetworkCalls();
    }

    private void initView() {

        mAppBarLayout = (AppBarLayout) findViewById(R.id.appBarLayout_restaurant);
        mCollapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsingToolbarLayout_restaurant);
        mImageViewCover = (ImageView) findViewById(R.id.imageView_cover_restaurant);
        mLinearLayoutInformations = (LinearLayout) findViewById(R.id.linearLayout_informations_restaurant);
        mLinearLayoutReviewContent = (LinearLayout) findViewById(R.id.linearLayout_review_content_restaurant);
        mTextViewCategory = (TextView) findViewById(R.id.textView_category_restaurant);
        mTextViewPrice = (TextView) findViewById(R.id.textView_price_restaurant);
        mTextViewName = (TextView) findViewById(R.id.textView_name_restaurant);
        mTextViewAddress = (TextView) findViewById(R.id.textView_address_restaurant);
        mTextViewPictureNumber = (TextView) findViewById(R.id.textView_picture_number_restaurant);
        mTextViewRating = (TextView) findViewById(R.id.textView_rating_restaurant);
        mTextViewOpinion = (TextView) findViewById(R.id.textView_opinion_restaurant);
        mTextViewPlan = (TextView) findViewById(R.id.textView_plan_restaurant);
        mRelativeLayoutTabPictures = (RelativeLayout) findViewById(R.id.relativeLayout_picture_tab_restaurant);
        mRelativeLayoutTabPlan = (RelativeLayout) findViewById(R.id.relativeLayout_plan_tab_restaurant);
        mSupportMapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_map_restaurant);

        displayImageOptions = new DisplayImageOptions.Builder()
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .considerExifParams(true)
                .bitmapConfig(Bitmap.Config.ARGB_8888)
                .showImageOnLoading(R.drawable.bg_primary_rectangle)
                .displayer(new FadeInBitmapDisplayer(300))
                .build();

        animationSlideUp = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_up);

        animationFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_out);

        animationFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_in);

        initToolbar();
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (toolbar != null && getSupportActionBar() != null) {
            toolbar.setTitle("");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        mCollapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(android.R.color.transparent));
    }

    private void initListeners() {

        mRelativeLayoutTabPictures.setOnClickListener(onClickListenerPicturesTab);
        mRelativeLayoutTabPlan.setOnClickListener(onClickListenerPlanTab);
        mSupportMapFragment.getMapAsync(onMapReadyCallback);
        mAppBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                presenter.updateInformationsState(verticalOffset);
            }
        });
    }

    private void initData() {

        RestaurantService service = ((RestaurantApplication) getApplication()).getRestaurantService();

        presenter = new RestaurantPresenter(this, service);
        presenter.attachView(this);
        presenter.initData(getIntent().getExtras());
    }

    @Override
    public void displayCoverPicture(String url) {
        ImageAware imageAware = new ImageViewAware(mImageViewCover, false);
        ImageLoader.getInstance().displayImage(url, imageAware, displayImageOptions);
    }

    @Override
    public void displayInfoCategory(String infoCategory) {
        mTextViewCategory.setText(infoCategory);
    }

    @Override
    public void displayInfoPrice(String infoPrice) {
        mTextViewPrice.setText(infoPrice);
    }

    @Override
    public void displayName(String name) {
        mTextViewName.setText(name);
    }

    @Override
    public void displayAddress(String address) {
        mTextViewAddress.setText(address);
    }

    @Override
    public void displayPictureNumber(String pictureNumber) {
        mTextViewPictureNumber.setText(pictureNumber);
    }

    @Override
    public void displayRating(String rating) {
        mTextViewRating.setText(rating);
    }

    @Override
    public void displayOpinionNumber(String opinionNumber) {
        mTextViewOpinion.setText(opinionNumber);
    }

    @Override
    public void showRestaurantInfo() {
        mLinearLayoutInformations.setVisibility(View.VISIBLE);
        mLinearLayoutInformations.startAnimation(animationFadeIn);
    }

    @Override
    public void hideRestaurantInfo() {
        mLinearLayoutInformations.setVisibility(View.GONE);
        mLinearLayoutInformations.startAnimation(animationFadeOut);
    }

    @Override
    public void showPhotoNumberInfo() {
        mTextViewPictureNumber.setVisibility(View.VISIBLE);
        mTextViewPictureNumber.startAnimation(animationSlideUp);
    }

    @Override
    public void showReviewInfo() {
        mLinearLayoutReviewContent.setVisibility(View.VISIBLE);
        mLinearLayoutReviewContent.startAnimation(animationSlideUp);
    }

    @Override
    public void showPlanInfo() {
        mTextViewPlan.setVisibility(View.VISIBLE);
        mTextViewPlan.startAnimation(animationSlideUp);
    }

    @Override
    public void setTitle(String title) {
        mCollapsingToolbarLayout.setTitle(title);
    }
}
