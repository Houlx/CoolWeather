package com.houlx.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by houlx on 2017/8/30.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
