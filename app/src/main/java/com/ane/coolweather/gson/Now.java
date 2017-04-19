package com.ane.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by YangJinhua on 2017/4/17 0017.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
