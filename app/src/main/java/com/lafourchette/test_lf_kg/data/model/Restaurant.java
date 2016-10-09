package com.lafourchette.test_lf_kg.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    @SerializedName("id_restaurant")
    private Integer idRestaurant;

    @SerializedName("name")
    private String name;

    @SerializedName("portal_url")
    private String portalUrl;

    @SerializedName("gps_lat")
    private Double gpsLat;

    @SerializedName("gps_long")
    private Double gpsLong;

    @SerializedName("address")
    private String address;

    @SerializedName("id_city")
    private Integer idCity;

    @SerializedName("city")
    private String city;

    @SerializedName("id_city_zipcode")
    private Integer idCityZipcode;

    @SerializedName("zipcode")
    private String zipcode;

    @SerializedName("id_country")
    private Integer idCountry;

    @SerializedName("locale_code")
    private String localeCode;

    @SerializedName("phone")
    private String phone;

    @SerializedName("email")
    private String email;

    @SerializedName("rate_count")
    private Integer rateCount;

    @SerializedName("pics_main")
    private Picture picture;

    @SerializedName("pics_diaporama")
    private List<PictureDiaporama> pictureDiaporamas = new ArrayList<PictureDiaporama>();

    @SerializedName("currency_code")
    private String currencyCode;

    @SerializedName("min_price")
    private Integer minPrice;

    @SerializedName("min_price_before")
    private Integer minPriceBefore;

    @SerializedName("web_max_days")
    private Integer webMaxDays;

    @SerializedName("is_lf_test_restaurant")
    private Integer isLfTestRestaurant;

    @SerializedName("is_published_affiliate")
    private Integer isPublishedAffiliate;

    @SerializedName("is_published_portal")
    private Integer isPublishedPortal;

    @SerializedName("is_phone_displayed")
    private Integer isPhoneDisplayed;

    @SerializedName("card_price")
    private Integer cardPrice;

    @SerializedName("id_restaurant_tag_speciality")
    private Integer idRestaurantTagSpeciality;

    @SerializedName("id_restaurant_tag_speciality_category")
    private Integer idRestaurantTagSpecialityCategory;

    @SerializedName("speciality")
    private String speciality;

    @SerializedName("id_sale_type_normal")
    private Integer idSaleTypeNormal;

    @SerializedName("avg_rate")
    private Double avgRate;

    @SerializedName("avg_rate_evolution")
    private String avgRateEvolution;

    @SerializedName("rate_distinction")
    private String rateDistinction;

    @SerializedName("chef_name")
    private Object chefName;

    @SerializedName("description")
    private String description;

    @SerializedName("hour_open")
    private String hourOpen;

    @SerializedName("vacation")
    private Object vacation;

    @SerializedName("transport")
    private String transport;

    @SerializedName("parking")
    private Object parking;

    @SerializedName("other_localization_infos")
    private String otherLocalizationInfos;

    @SerializedName("nb_max_group")
    private Integer nbMaxGroup;

    @SerializedName("card_start_1")
    private String cardStart1;

    @SerializedName("card_start_2")
    private String cardStart2;

    @SerializedName("card_start_3")
    private String cardStart3;

    @SerializedName("card_main_1")
    private String cardMain1;

    @SerializedName("card_main_2")
    private String cardMain2;

    @SerializedName("card_main_3")
    private String cardMain3;

    @SerializedName("card_dessert_1")
    private String cardDessert1;

    @SerializedName("card_dessert_2")
    private String cardDessert2;

    @SerializedName("card_dessert_3")
    private String cardDessert3;

    @SerializedName("price_card_dessert_3")
    private Double priceCardDessert3;

    @SerializedName("price_half_bottle_of_mineral_water")
    private Integer priceHalfBottleOfMineralWater;

    @SerializedName("price_bottle_of_mineral_water")
    private Integer priceBottleOfMineralWater;

    @SerializedName("price_bottle_of_wine_max")
    private Integer priceBottleOfWineMax;

    @SerializedName("price_bottle_of_wine_min")
    private Integer priceBottleOfWineMin;

    @SerializedName("price_of_coffee")
    private Integer priceOfCoffee;

    @SerializedName("trip_advisor_avg_rating")
    private Double tripAdvisorAvgRating;

    @SerializedName("trip_advisor_review_count")
    private Integer tripAdvisorReviewCount;

    @SerializedName("has_stock")
    private Integer hasStock;

    @SerializedName("is_opened")
    private Integer isOpened;

    public Integer getIdRestaurant() {
        return idRestaurant;
    }

    public void setIdRestaurant(Integer idRestaurant) {
        this.idRestaurant = idRestaurant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPortalUrl() {
        return portalUrl;
    }

    public void setPortalUrl(String portalUrl) {
        this.portalUrl = portalUrl;
    }

    public Double getGpsLat() {
        return gpsLat;
    }

    public void setGpsLat(Double gpsLat) {
        this.gpsLat = gpsLat;
    }

    public Double getGpsLong() {
        return gpsLong;
    }

    public void setGpsLong(Double gpsLong) {
        this.gpsLong = gpsLong;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getIdCity() {
        return idCity;
    }

    public void setIdCity(Integer idCity) {
        this.idCity = idCity;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getIdCityZipcode() {
        return idCityZipcode;
    }

    public void setIdCityZipcode(Integer idCityZipcode) {
        this.idCityZipcode = idCityZipcode;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Integer getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Integer idCountry) {
        this.idCountry = idCountry;
    }

    public String getLocaleCode() {
        return localeCode;
    }

    public void setLocaleCode(String localeCode) {
        this.localeCode = localeCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRateCount() {
        return rateCount;
    }

    public void setRateCount(Integer rateCount) {
        this.rateCount = rateCount;
    }

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Integer getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Integer minPrice) {
        this.minPrice = minPrice;
    }

    public Integer getMinPriceBefore() {
        return minPriceBefore;
    }

    public void setMinPriceBefore(Integer minPriceBefore) {
        this.minPriceBefore = minPriceBefore;
    }

    public Integer getWebMaxDays() {
        return webMaxDays;
    }

    public void setWebMaxDays(Integer webMaxDays) {
        this.webMaxDays = webMaxDays;
    }

    public Integer getIsLfTestRestaurant() {
        return isLfTestRestaurant;
    }

    public void setIsLfTestRestaurant(Integer isLfTestRestaurant) {
        this.isLfTestRestaurant = isLfTestRestaurant;
    }

    public Integer getIsPublishedAffiliate() {
        return isPublishedAffiliate;
    }

    public void setIsPublishedAffiliate(Integer isPublishedAffiliate) {
        this.isPublishedAffiliate = isPublishedAffiliate;
    }

    public Integer getIsPublishedPortal() {
        return isPublishedPortal;
    }

    public void setIsPublishedPortal(Integer isPublishedPortal) {
        this.isPublishedPortal = isPublishedPortal;
    }

    public Integer getIsPhoneDisplayed() {
        return isPhoneDisplayed;
    }

    public void setIsPhoneDisplayed(Integer isPhoneDisplayed) {
        this.isPhoneDisplayed = isPhoneDisplayed;
    }

    public Integer getCardPrice() {
        return cardPrice;
    }

    public void setCardPrice(Integer cardPrice) {
        this.cardPrice = cardPrice;
    }

    public Integer getIdRestaurantTagSpeciality() {
        return idRestaurantTagSpeciality;
    }

    public void setIdRestaurantTagSpeciality(Integer idRestaurantTagSpeciality) {
        this.idRestaurantTagSpeciality = idRestaurantTagSpeciality;
    }

    public Integer getIdRestaurantTagSpecialityCategory() {
        return idRestaurantTagSpecialityCategory;
    }

    public void setIdRestaurantTagSpecialityCategory(Integer idRestaurantTagSpecialityCategory) {
        this.idRestaurantTagSpecialityCategory = idRestaurantTagSpecialityCategory;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Integer getIdSaleTypeNormal() {
        return idSaleTypeNormal;
    }

    public void setIdSaleTypeNormal(Integer idSaleTypeNormal) {
        this.idSaleTypeNormal = idSaleTypeNormal;
    }

    public Double getAvgRate() {
        return avgRate;
    }

    public void setAvgRate(Double avgRate) {
        this.avgRate = avgRate;
    }

    public String getAvgRateEvolution() {
        return avgRateEvolution;
    }

    public void setAvgRateEvolution(String avgRateEvolution) {
        this.avgRateEvolution = avgRateEvolution;
    }

    public String getRateDistinction() {
        return rateDistinction;
    }

    public void setRateDistinction(String rateDistinction) {
        this.rateDistinction = rateDistinction;
    }

    public Object getChefName() {
        return chefName;
    }

    public void setChefName(Object chefName) {
        this.chefName = chefName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHourOpen() {
        return hourOpen;
    }

    public void setHourOpen(String hourOpen) {
        this.hourOpen = hourOpen;
    }

    public Object getVacation() {
        return vacation;
    }

    public void setVacation(Object vacation) {
        this.vacation = vacation;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public Object getParking() {
        return parking;
    }

    public void setParking(Object parking) {
        this.parking = parking;
    }

    public String getOtherLocalizationInfos() {
        return otherLocalizationInfos;
    }

    public void setOtherLocalizationInfos(String otherLocalizationInfos) {
        this.otherLocalizationInfos = otherLocalizationInfos;
    }

    public Integer getNbMaxGroup() {
        return nbMaxGroup;
    }

    public void setNbMaxGroup(Integer nbMaxGroup) {
        this.nbMaxGroup = nbMaxGroup;
    }

    public String getCardStart1() {
        return cardStart1;
    }

    public void setCardStart1(String cardStart1) {
        this.cardStart1 = cardStart1;
    }

    public String getCardStart2() {
        return cardStart2;
    }

    public void setCardStart2(String cardStart2) {
        this.cardStart2 = cardStart2;
    }

    public String getCardStart3() {
        return cardStart3;
    }

    public void setCardStart3(String cardStart3) {
        this.cardStart3 = cardStart3;
    }

    public String getCardMain1() {
        return cardMain1;
    }

    public void setCardMain1(String cardMain1) {
        this.cardMain1 = cardMain1;
    }

    public String getCardMain2() {
        return cardMain2;
    }

    public void setCardMain2(String cardMain2) {
        this.cardMain2 = cardMain2;
    }

    public String getCardMain3() {
        return cardMain3;
    }

    public void setCardMain3(String cardMain3) {
        this.cardMain3 = cardMain3;
    }

    public String getCardDessert1() {
        return cardDessert1;
    }

    public void setCardDessert1(String cardDessert1) {
        this.cardDessert1 = cardDessert1;
    }

    public String getCardDessert2() {
        return cardDessert2;
    }

    public void setCardDessert2(String cardDessert2) {
        this.cardDessert2 = cardDessert2;
    }

    public String getCardDessert3() {
        return cardDessert3;
    }

    public void setCardDessert3(String cardDessert3) {
        this.cardDessert3 = cardDessert3;
    }

    public Double getPriceCardDessert3() {
        return priceCardDessert3;
    }

    public void setPriceCardDessert3(Double priceCardDessert3) {
        this.priceCardDessert3 = priceCardDessert3;
    }

    public Integer getPriceHalfBottleOfMineralWater() {
        return priceHalfBottleOfMineralWater;
    }

    public void setPriceHalfBottleOfMineralWater(Integer priceHalfBottleOfMineralWater) {
        this.priceHalfBottleOfMineralWater = priceHalfBottleOfMineralWater;
    }

    public Integer getPriceBottleOfMineralWater() {
        return priceBottleOfMineralWater;
    }

    public void setPriceBottleOfMineralWater(Integer priceBottleOfMineralWater) {
        this.priceBottleOfMineralWater = priceBottleOfMineralWater;
    }

    public Integer getPriceBottleOfWineMax() {
        return priceBottleOfWineMax;
    }

    public void setPriceBottleOfWineMax(Integer priceBottleOfWineMax) {
        this.priceBottleOfWineMax = priceBottleOfWineMax;
    }

    public Integer getPriceBottleOfWineMin() {
        return priceBottleOfWineMin;
    }

    public void setPriceBottleOfWineMin(Integer priceBottleOfWineMin) {
        this.priceBottleOfWineMin = priceBottleOfWineMin;
    }

    public Integer getPriceOfCoffee() {
        return priceOfCoffee;
    }

    public void setPriceOfCoffee(Integer priceOfCoffee) {
        this.priceOfCoffee = priceOfCoffee;
    }

    public Double getTripAdvisorAvgRating() {
        return tripAdvisorAvgRating;
    }

    public void setTripAdvisorAvgRating(Double tripAdvisorAvgRating) {
        this.tripAdvisorAvgRating = tripAdvisorAvgRating;
    }

    public Integer getTripAdvisorReviewCount() {
        return tripAdvisorReviewCount;
    }

    public void setTripAdvisorReviewCount(Integer tripAdvisorReviewCount) {
        this.tripAdvisorReviewCount = tripAdvisorReviewCount;
    }

    public Integer getHasStock() {
        return hasStock;
    }

    public void setHasStock(Integer hasStock) {
        this.hasStock = hasStock;
    }

    public Integer getIsOpened() {
        return isOpened;
    }

    public void setIsOpened(Integer isOpened) {
        this.isOpened = isOpened;
    }

    public List<PictureDiaporama> getPictureDiaporamas() {
        return pictureDiaporamas;
    }

    public void setPictureDiaporamas(List<PictureDiaporama> pictureDiaporamas) {
        this.pictureDiaporamas = pictureDiaporamas;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "idRestaurant=" + idRestaurant +
                ", name='" + name + '\'' +
                ", portalUrl='" + portalUrl + '\'' +
                ", gpsLat=" + gpsLat +
                ", gpsLong=" + gpsLong +
                ", address='" + address + '\'' +
                ", idCity=" + idCity +
                ", city='" + city + '\'' +
                ", idCityZipcode=" + idCityZipcode +
                ", zipcode='" + zipcode + '\'' +
                ", idCountry=" + idCountry +
                ", localeCode='" + localeCode + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", rateCount=" + rateCount +
                ", picture=" + picture +
                ", pictureDiaporamas=" + pictureDiaporamas +
                ", currencyCode='" + currencyCode + '\'' +
                ", minPrice=" + minPrice +
                ", minPriceBefore=" + minPriceBefore +
                ", webMaxDays=" + webMaxDays +
                ", isLfTestRestaurant=" + isLfTestRestaurant +
                ", isPublishedAffiliate=" + isPublishedAffiliate +
                ", isPublishedPortal=" + isPublishedPortal +
                ", isPhoneDisplayed=" + isPhoneDisplayed +
                ", cardPrice=" + cardPrice +
                ", idRestaurantTagSpeciality=" + idRestaurantTagSpeciality +
                ", idRestaurantTagSpecialityCategory=" + idRestaurantTagSpecialityCategory +
                ", speciality='" + speciality + '\'' +
                ", idSaleTypeNormal=" + idSaleTypeNormal +
                ", avgRate=" + avgRate +
                ", avgRateEvolution='" + avgRateEvolution + '\'' +
                ", rateDistinction='" + rateDistinction + '\'' +
                ", chefName=" + chefName +
                ", description='" + description + '\'' +
                ", hourOpen='" + hourOpen + '\'' +
                ", vacation=" + vacation +
                ", transport='" + transport + '\'' +
                ", parking=" + parking +
                ", otherLocalizationInfos='" + otherLocalizationInfos + '\'' +
                ", nbMaxGroup=" + nbMaxGroup +
                ", cardStart1='" + cardStart1 + '\'' +
                ", cardStart2='" + cardStart2 + '\'' +
                ", cardStart3='" + cardStart3 + '\'' +
                ", cardMain1='" + cardMain1 + '\'' +
                ", cardMain2='" + cardMain2 + '\'' +
                ", cardMain3='" + cardMain3 + '\'' +
                ", cardDessert1='" + cardDessert1 + '\'' +
                ", cardDessert2='" + cardDessert2 + '\'' +
                ", cardDessert3='" + cardDessert3 + '\'' +
                ", priceCardDessert3=" + priceCardDessert3 +
                ", priceHalfBottleOfMineralWater=" + priceHalfBottleOfMineralWater +
                ", priceBottleOfMineralWater=" + priceBottleOfMineralWater +
                ", priceBottleOfWineMax=" + priceBottleOfWineMax +
                ", priceBottleOfWineMin=" + priceBottleOfWineMin +
                ", priceOfCoffee=" + priceOfCoffee +
                ", tripAdvisorAvgRating=" + tripAdvisorAvgRating +
                ", tripAdvisorReviewCount=" + tripAdvisorReviewCount +
                ", hasStock=" + hasStock +
                ", isOpened=" + isOpened +
                '}';
    }
}
