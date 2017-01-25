package com.example.moviefirst.api;


import com.example.moviefirst.model.Search;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by васыль on 16.01.2017.
 */

public interface OmdbApi {
    @GET(".")
    Call<Search> getData(@Query("s")String search);
}
