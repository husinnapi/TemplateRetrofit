package com.templateretrofit.husinnapi.templateretrofit.API;

import com.templateretrofit.husinnapi.templateretrofit.model.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by husinnapi on 9/17/16.
 */
public interface MyApiEndPointInterface {
    @GET("/search/users")
    Call<User> getUserNamedTom(@Query("q") String name);
}
