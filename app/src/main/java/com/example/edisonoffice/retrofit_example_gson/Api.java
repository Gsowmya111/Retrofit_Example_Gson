package com.example.edisonoffice.retrofit_example_gson;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by edison office on 8/17/2018.
 */

public interface Api {

    String BASE_URL = "https://simplifiedcoding.net/demos/";
    @GET("marvel")
    Call<List<Hero>> getHeroes();
}
