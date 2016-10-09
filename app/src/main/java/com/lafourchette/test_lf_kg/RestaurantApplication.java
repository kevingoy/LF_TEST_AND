package com.lafourchette.test_lf_kg;

import android.app.Application;

import com.lafourchette.test_lf_kg.data.network.RestaurantService;
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;

public class RestaurantApplication extends Application {

    private RestaurantService restaurantService;

    @Override
    public void onCreate() {
        super.onCreate();

        restaurantService = new RestaurantService();

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(this)
                .threadPriority(Thread.NORM_PRIORITY - 2)
                .denyCacheImageMultipleSizesInMemory()
                .diskCacheFileNameGenerator(new Md5FileNameGenerator())
                .diskCacheSize(50 * 1024 * 1024)
                .tasksProcessingOrder(QueueProcessingType.LIFO)
                .build();

        ImageLoader.getInstance().init(config);
    }

    public RestaurantService getRestaurantService(){
        return restaurantService;
    }
}
