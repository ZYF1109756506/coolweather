package com.example.coolweather.db;


import com.google.gson.annotations.SerializedName;

import org.litepal.crud.LitePalSupport;

public class Province extends LitePalSupport {

    /**
     * id : 1
     * name : 北京
     */
    private int id;

    @SerializedName("id")
    private int provinceCode;

    @SerializedName("name")
    private String provinceName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}
