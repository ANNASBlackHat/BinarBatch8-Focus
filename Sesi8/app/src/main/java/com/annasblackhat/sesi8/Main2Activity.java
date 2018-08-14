package com.annasblackhat.sesi8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        RecyclerView recyclerView = findViewById(R.id.recview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<String> listData = new ArrayList<>();
        RecviewAdapter adapter = new RecviewAdapter(listData);

        recyclerView.setAdapter(adapter);

        listData.add("Budi");
        listData.add("Andi");
        listData.add("Suli");
        listData.add("Fahri");
        for (int i = 0; i < 1000; i++) {
            listData.add("No Data - "+i);
        }
        adapter.notifyDataSetChanged();
    }
}
