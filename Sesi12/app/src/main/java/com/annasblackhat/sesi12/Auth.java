package com.annasblackhat.sesi12;

import com.google.gson.annotations.SerializedName;

/**
 * Created by annasblackhat on 21/08/18
 */

public class Auth {
    @SerializedName("user_id")
    private String userId;

    private String token;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
