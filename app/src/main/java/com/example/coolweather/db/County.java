package com.example.coolweather.db;

import com.google.gson.annotations.SerializedName;

import org.litepal.crud.LitePalSupport;

public class County extends LitePalSupport {

    /**
     * id : 1967
     * name : 成都
     * cid : CN101270101
     */
    private int id;

    private int cityId;

    @SerializedName("name")
    private String countryName;

    @SerializedName("weather_id")
    private String weatherId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}

