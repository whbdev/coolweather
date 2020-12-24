package com.coolweather.android.gson;

//AQI类当前天气质量相关信息
public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
