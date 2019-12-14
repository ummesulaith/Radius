package com.example.radiusassessment.Model.children;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stats {
    @SerializedName("rides")
    @Expose
    private String rides;

    @SerializedName("free_rides")
    @Expose
    private String free_rides;

    @SerializedName("credits")
    @Expose
    private Stats_Credits credits;

    @Override
    public String toString() {
        return "Stats{" +
                "rides='" + rides + '\'' +
                ", free_rides='" + free_rides + '\'' +
                ", credits=" + credits +
                '}';
    }

    public String getRides() {
        return rides;
    }

    public void setRides(String rides) {
        this.rides = rides;
    }

    public String getFree_rides() {
        return free_rides;
    }

    public void setFree_rides(String free_rides) {
        this.free_rides = free_rides;
    }

    public Stats_Credits getCredits() {
        return credits;
    }

    public void setCredits(Stats_Credits credits) {
        this.credits = credits;
    }

    public Stats(String rides, String free_rides, Stats_Credits credits) {
        this.rides = rides;
        this.free_rides = free_rides;
        this.credits = credits;
    }
}
