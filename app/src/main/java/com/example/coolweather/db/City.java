package com.example.coolweather.db;

import com.google.gson.annotations.SerializedName;

import org.litepal.crud.DataSupport;
import org.litepal.crud.LitePalSupport;

public class City extends LitePalSupport {

    /**
     * id : 267
     * name : 成都
     */
    private int id;

    private int provinceId;

    @SerializedName("id")
    private int cityCode;

    @SerializedName("name")
    private String cityName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
