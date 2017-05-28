package com.example.asus.coolweather.gson;

/**
 * Created by ASUS on 2017/1/26.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
