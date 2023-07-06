package com.example.broadcast.Bean;

import com.google.gson.annotations.SerializedName;

public class WeatherBean {

    @SerializedName("date")
    private String date;
    @SerializedName("cityInfo")
    private cityBean cityinfo;
    @SerializedName("data")
    private dayBean data;


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public cityBean getCityinfo() {
        return cityinfo;
    }

    public void setCityinfo(cityBean cityinfo) {
        this.cityinfo = cityinfo;
    }

    public dayBean getData() {
        return data;
    }

    public void setData(dayBean data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "WeatherBean{" +
                "date='" + date + '\'' +
                ", cityinfo=" + cityinfo +
                ", data=" + data +
                '}';
    }
}
