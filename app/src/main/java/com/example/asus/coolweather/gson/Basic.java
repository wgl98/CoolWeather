package com.example.asus.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ASUS on 2019/11/12.
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
