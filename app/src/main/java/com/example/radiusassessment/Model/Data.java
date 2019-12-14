package com.example.radiusassessment.Model;

import com.example.radiusassessment.Model.children.Profile;
import com.example.radiusassessment.Model.children.Stats;
import com.example.radiusassessment.Model.children.Trips;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Data {

    @SerializedName("profile")
    @Expose
    private Profile profile;

    @SerializedName("stats")
    @Expose
    private Stats stats;

    @SerializedName("trips")
    @Expose
    private ArrayList<Trips> trips;

    @Override
    public String toString() {
        return "Data{" +
                "profile='" + profile + '\'' +
                ", stats='" + stats + '\'' +
                ", trips=" + trips +
                '}';
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public ArrayList<Trips> getTrips() {
        return trips;
    }

    public void setTrips(ArrayList<Trips> trips) {
        this.trips = trips;
    }

    public Data(Profile profile, Stats stats, ArrayList<Trips> trips) {
        this.profile = profile;
        this.stats = stats;
        this.trips = trips;
    }
}
