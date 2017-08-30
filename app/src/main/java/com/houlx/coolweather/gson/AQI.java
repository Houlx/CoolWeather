package com.houlx.coolweather.gson;

/**
 * Created by houlx on 2017/8/30.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
