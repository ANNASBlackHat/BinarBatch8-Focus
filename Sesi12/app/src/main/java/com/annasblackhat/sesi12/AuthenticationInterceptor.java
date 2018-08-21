package com.annasblackhat.sesi12;

import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Credentials;
import okhttp3.FormBody;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by annasblackhat on 21/08/18
 */
public class AuthenticationInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request.Builder request = chain.request().newBuilder();
        Response response = chain.proceed(request.build());

        if (response.code() == 401 || response.code() == 403) {
            Request authRequest = new Request.Builder()
                    .url("https://api.bukalapak.com/v2/authenticate.json")
                    .post(new FormBody.Builder().build())
                    .addHeader("Authorization", Credentials.basic("annas685@gmail.com", "..."))
                    .build();

            //proses meminta token ke server
            Response authResponse = new OkHttpClient().newCall(authRequest).execute();

            //mendapatkan hasil berupa json dari server
            String authJson = authResponse.body().string();

            //convert json ke dalam class pojo
            Auth auth = new Gson().fromJson(authJson, Auth.class);

            request.addHeader("Authorization", Credentials.basic(auth.getUserId(), auth.getToken()));
            return chain.proceed(request.build());
        }

        return response;
    }
}
