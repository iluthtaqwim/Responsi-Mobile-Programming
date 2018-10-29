package com.example.iluth.pam.api;

/**
 * Created by iluth on 29/10/18.
 */

import com.example.iluth.pam.model.Movie;
import com.example.iluth.pam.model.MovieResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by zulfakar on 29/10/18.
 * For educational purposes
 */
public interface IRetrofit {
    //    itu API_KEY ku, ganti pake API_KEY mu :D
    @GET("now_playing?api_key=280af572647b3e8153b144e478ba7a36")
    Call<List<Movie>> getMoviesT();

    @GET("now_playing?api_key=280af572647b3e8153b144e478ba7a36")
    Call<MovieResponse> getMovies();

}