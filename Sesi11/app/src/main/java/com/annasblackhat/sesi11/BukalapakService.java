package com.annasblackhat.sesi11;

import com.annasblackhat.sesi11.model.Category;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by annasblackhat on 20/08/18
 */
public interface BukalapakService {

    @GET("categories/{id}/attributes.json")
    Call<Category> getCategoryAttribute(@Path("id")int idCategory);

    ///banks.json?payment_bank_account[name]=Fauziahaz&payment_bank_account[bank]=Bank Central Asia (BCA)
    @GET("banks.json")
    Call<ResponseBody> addBank(@Query("payment_bank_account[name]") String bankAccountName,
                               @Query("payment_bank_account[bank]")String bankAccount);

    @PUT("users/43574807.json")
    Call<ResponseBody> updateProfile(@Field("user[name]")String username);
}
