package com.annasblackhat.sesi12;

import com.google.gson.annotations.SerializedName;

/**
 * Created by annasblackhat on 21/08/18
 */
public class UserReponse {
    @SerializedName("status")
    private String status;

    @SerializedName("user")
    private User user;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
