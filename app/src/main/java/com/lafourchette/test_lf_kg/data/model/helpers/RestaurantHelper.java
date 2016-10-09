package com.lafourchette.test_lf_kg.data.model.helpers;

import android.content.Context;

import com.lafourchette.test_lf_kg.R;
import com.lafourchette.test_lf_kg.data.model.Restaurant;
import com.lafourchette.test_lf_kg.utils.Currency;

public class RestaurantHelper {

    public static String getAddress(Restaurant restaurant){
        String address = restaurant.getAddress() +
                ", " +
                restaurant.getZipcode() +
                " " +
                restaurant.getCity();

        return address;
    }

    public static String getPictureNumber(Context context, Restaurant restaurant){
        return context.getResources().getQuantityString(R.plurals.picture_number_restaurant, restaurant.getPictureDiaporamas().size(), restaurant.getPictureDiaporamas().size());
    }

    public static String getReviewCount(Context context, Restaurant restaurant){
        String reviewCount = String.valueOf(restaurant.getTripAdvisorReviewCount()) +
                " " +
                context.getResources().getString(R.string.review_restaurant);

        return reviewCount;
    }

    public static String getMinPriceBefore(Context context, Restaurant restaurant){
        String minPrice = String.valueOf(restaurant.getMinPriceBefore()) +
                context.getResources().getString(Currency.valueOf(restaurant.getCurrencyCode()).getCurrencyId());

        return minPrice;
    }
}
