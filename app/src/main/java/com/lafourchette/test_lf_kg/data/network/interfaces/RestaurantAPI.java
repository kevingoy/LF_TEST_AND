package com.lafourchette.test_lf_kg.data.network.interfaces;

import com.lafourchette.test_lf_kg.data.model.Restaurant;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface RestaurantAPI {

    @GET("api")
    Observable<Restaurant> getRestaurant(@Query("method") String method, @Query("id_restaurant") String idRestaurant);
}