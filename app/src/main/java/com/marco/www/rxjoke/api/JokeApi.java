package com.marco.www.rxjoke.api;

import com.marco.www.rxjoke.model.JokeEntity;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by JDD on 2016/4/8.
 */
public interface JokeApi {

    @Headers("apikey:83ec99fff780989a5376a1bc595ed5ff")
    @GET("showapi_joke/joke_text")
    Observable<JokeEntity> getJoke(@Query("page") int page);

    @GET("showapi_joke/joke_text")
    Call<JokeEntity> callJoke(@Header("apikey") String apikey, @Query("page") int page);

}
