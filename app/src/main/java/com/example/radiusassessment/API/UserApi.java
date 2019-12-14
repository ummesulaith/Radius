package com.example.radiusassessment.API;

import com.example.radiusassessment.Model.Userdata;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UserApi {

    public static final String BASE_URL= "https://gist.githubusercontent.com/iranjith4/522d5b466560e91b8ebab54743f2d0fc/raw/7b108e4aaac287c6c3fdf93c3343dd1c62d24faf/";

    @GET("radius-mobile-intern.json")
    public Call<Userdata> getUserdata();
}
