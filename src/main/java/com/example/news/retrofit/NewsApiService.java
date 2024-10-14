package com.example.news.retrofit;

import com.example.news.model.NewsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NewsApiService {
    @GET("everything")
    Call<NewsResponse> getTopHeadlines(
            @Query("q") String query,
            @Query("apiKey") String apiKey
    );

    @GET("top-headlines")
    Call<NewsResponse> getEverything(
            @Query("q") String query,
            @Query("apiKey") String apiKey
    );

}


