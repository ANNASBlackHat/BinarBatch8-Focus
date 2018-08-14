package com.annasblackhat.sesi8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by annasblackhat on 13/08/18
 */
public class ListAdapter extends BaseAdapter {

    List<String> listData;

    public ListAdapter(List<String> listData) {
        this.listData = listData;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }
    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public int getCount() {
        return listData.size(); //mengembalikan jumlah item yang akan ditampilkan
    }

    //mengembalikan View/UI yang akan ditampilkann secara berulang oleh listview
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_1, parent, false);
        TextView txtName = view.findViewById(R.id.textView);

        txtName.setText(listData.get(position));
        System.out.println("position : "+position);

        return view;
    }
}
