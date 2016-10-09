package com.lafourchette.test_lf_kg.ui.logic.restaurant;

interface RestaurantViewPresenter {

    void displayCoverPicture(String url);

    void displayInfoCategory(String infoCategory);

    void displayInfoPrice(String infoPrice);

    void displayName(String name);

    void displayAddress(String address);

    void displayPictureNumber(String pictureNumber);

    void displayRating(String rating);

    void displayOpinionNumber(String opinionNumber);

    void showRestaurantInfo();

    void hideRestaurantInfo();

    void showPhotoNumberInfo();

    void showReviewInfo();

    void showPlanInfo();

    void setTitle(String title);
}
