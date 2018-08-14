package com.annasblackhat.sesi8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> listData = new ArrayList<>();

        ListView listView = findViewById(R.id.list_view);
        ListAdapter adapter = new ListAdapter(listData);
        listView.setAdapter(adapter);

        listData.add("Budi");
        listData.add("Andi");
        listData.add("Suli");
        listData.add("Fahri");
        for (int i = 0; i < 1000; i++) {
            listData.add("No Data - "+i);
        }
        adapter.notifyDataSetChanged();

        Button btnNext = findViewById(R.id.btn_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
