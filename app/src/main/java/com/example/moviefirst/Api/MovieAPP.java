package com.example.moviefirst.Api;

import android.app.Application;

import com.example.moviefirst.Api.RetrofitInterface;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by васыль on 20.01.2017.
 */

public class MovieAPP extends Application {
    private static RetrofitInterface movieApi;
    private Retrofit retrofit;


    @Override
    public void onCreate() {
        super.onCreate();
        retrofit = new Retrofit.Builder().baseUrl("http://www.omdbapi.com/").addConverterFactory(GsonConverterFactory.create()).build();
        movieApi = retrofit.create(RetrofitInterface.class);
    }
    public static RetrofitInterface getMovieApi() {
        return movieApi;
    }
}
