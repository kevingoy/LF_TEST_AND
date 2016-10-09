package com.lafourchette.test_lf_kg.data.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lafourchette.test_lf_kg.data.model.Restaurant;
import com.lafourchette.test_lf_kg.data.network.interfaces.RestaurantAPI;
import com.lafourchette.test_lf_kg.utils.Constants;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;
import retrofit2.RxJavaCallAdapterFactory;
import rx.Observable;

public class RestaurantService {

    private Retrofit.Builder retrofitBuilder;

    public RestaurantService() {

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request original = chain.request();
                HttpUrl originalHttpUrl = original.url();

                HttpUrl url = originalHttpUrl.newBuilder()
                        .addQueryParameter("key", Constants.API_KEY)
                        .build();

                Request.Builder requestBuilder = original.newBuilder()
                        .url(url);

                Request request = requestBuilder.build();
                return chain.proceed(request);
            }
        });

        retrofitBuilder = new Retrofit.Builder()
                .baseUrl(Constants.API_ENDPOINT)
                .client(httpClient.build())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create());
    }

    public Observable<Restaurant> getRestaurant(String method, String restaurantId) {

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(Restaurant.class, new JsonConverter<Restaurant>())
                .create();

        Retrofit retrofit = retrofitBuilder
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        RestaurantAPI restaurantAPI = retrofit.create(RestaurantAPI.class);

        return restaurantAPI.getRestaurant(method, restaurantId);
    }
}
