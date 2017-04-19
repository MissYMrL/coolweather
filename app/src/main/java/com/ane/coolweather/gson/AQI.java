package com.ane.coolweather.gson;

/**
 * Created by YangJinhua on 2017/4/17 0017.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
