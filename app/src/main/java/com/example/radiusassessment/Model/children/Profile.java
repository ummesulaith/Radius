package com.example.radiusassessment.Model.children;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Profile {

    @SerializedName("first_name")
    @Expose
    private String first_name;

    @SerializedName("middle_name")
    @Expose
    private String middle_name;

    @SerializedName("last_name")
    @Expose
    private String last_name;

    @SerializedName("city")
    @Expose
    private String city;

    @SerializedName("Country")
    @Expose
    private String country;

    @Override
    public String toString() {
        return "Profile{" +
                "first_name='" + first_name + '\'' +
                ", middle_name='" + middle_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Profile(String first_name, String middle_name, String last_name, String city, String country) {
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.city = city;
        this.country = country;
    }
}
