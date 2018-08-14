package com.annasblackhat.sesi9;

import android.os.AsyncTask;

import java.util.List;

/**
 * Created by annasblackhat on 14/08/18
 */
public class DoSomeThingInBackground extends AsyncTask<String, Integer, List> {

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected List doInBackground(String... voids) {

        return null;
    }


    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);

    }

    @Override
    protected void onPostExecute(List aVoid) {
        super.onPostExecute(aVoid);

    }
}
