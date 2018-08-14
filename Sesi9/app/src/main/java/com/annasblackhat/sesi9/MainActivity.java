package com.annasblackhat.sesi9;

import android.arch.lifecycle.Observer;
import android.arch.persistence.room.Room;
import android.os.AsyncTask;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText edtTitle;
    private TextInputEditText edtContent;
    private TextView txtResult;
    private Button btnSave;
    private MyDatabase myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTitle = findViewById(R.id.edt_title);
        edtContent = findViewById(R.id.edt_content);
        txtResult = findViewById(R.id.txt_result);
        btnSave = findViewById(R.id.btn_save);

        myDB = Room.databaseBuilder(getApplicationContext(), MyDatabase.class, "news_app.db")
                .addMigrations(DbMigration.Migration_1_2)
//                .fallbackToDestructiveMigration() //berfungsi untuk me-recreate database saat versi berbeda
                .build();

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save();
            }
        });

        myDB.getNewsDao().getAllNewsLive()
                .observe(this, new Observer<List<News>>() {
                    @Override
                    public void onChanged(@Nullable List<News> newsList) {
                        String result = "Your Data : \n";
                        for(News nws: newsList){
                            result += nws.getTitle() + " # " + nws.getContent() + "\n";
                        }
                        txtResult.setText(result);
                    }
                });
    }

    private void save() {
        String strTitle = edtTitle.getText().toString();
        String strContent = edtContent.getText().toString();
        if(!(strTitle.isEmpty() || strContent.isEmpty())){
            News news = new News(strTitle, strContent, new Date());
            new AsyncTask<News, Void, Void>() {
                @Override
                protected Void doInBackground(News... data) {
                    myDB.getNewsDao().save(data[0]);
                    return null;
                }
            }.execute(news);
        }
    }
}
