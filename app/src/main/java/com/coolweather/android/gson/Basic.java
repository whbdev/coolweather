package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;
/**
 * 城市的基本信息，id表示城市对应天气的id,update中loc表示天气更新时间
 * 由于JSON中的一些字段可能不太合适直接作为Java字段来命名，因此这里使用了@SerializedName注解的方式来让JSON和Java之间建立映射关系
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
