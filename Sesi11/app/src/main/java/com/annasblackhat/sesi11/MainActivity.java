package com.annasblackhat.sesi11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.annasblackhat.sesi11.model.AttributesItem;
import com.annasblackhat.sesi11.model.Category;

import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult = findViewById(R.id.txt_result);

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.bukalapak.com/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();

        BukalapakService service = retrofit.create(BukalapakService.class);

        int idCategory = 8;
        service.getCategoryAttribute(idCategory).enqueue(new Callback<Category>() {
            @Override
            public void onResponse(Call<Category> call, Response<Category> response) {
                Category category = response.body();
                List<AttributesItem> list = category.getAttributes();
                String data = "";
                for(AttributesItem item: list){
                    data += item.getDisplayName() + "\n";
                }
                txtResult.setText(data);
            }

            @Override
            public void onFailure(Call<Category> call, Throwable t) { }
        });
    }

}
