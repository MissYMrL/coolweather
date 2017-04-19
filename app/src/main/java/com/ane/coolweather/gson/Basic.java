package com.ane.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by YangJinhua on 2017/4/17 0017.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
