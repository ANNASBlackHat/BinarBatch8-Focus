package com.annasblackhat.sesi12;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by annasblackhat on 21/08/18
 */

public interface BukalapakService {

    @GET("users/info.json")
    Call<UserReponse> getUserData();
}
