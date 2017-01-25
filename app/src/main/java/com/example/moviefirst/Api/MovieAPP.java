package com.example.moviefirst.api;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;



public class MovieApp extends Application {
    private static OmdbApi movieApi;
    private Retrofit retrofit;


    @Override
    public void onCreate() {
        super.onCreate();
        retrofit = new Retrofit.Builder().baseUrl("http://www.omdbapi.com/").addConverterFactory(GsonConverterFactory.create()).build();
        movieApi = retrofit.create(OmdbApi.class);
    }
    public static OmdbApi getMovieApi() {
        return movieApi;
    }
}
