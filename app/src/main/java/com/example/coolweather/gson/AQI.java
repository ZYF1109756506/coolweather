package com.example.coolweather.gson;

import java.io.StringReader;

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
