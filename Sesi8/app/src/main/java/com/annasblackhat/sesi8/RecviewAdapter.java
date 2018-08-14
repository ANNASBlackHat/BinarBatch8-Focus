package com.annasblackhat.sesi8;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by annasblackhat on 13/08/18
 */
public class RecviewAdapter extends RecyclerView.Adapter<RecviewAdapter.ViewHolderAdapter> {

    List<String> listData;

    public RecviewAdapter(List<String> listData) {
        this.listData = listData;
    }

    @NonNull
    @Override
    public ViewHolderAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_1, parent, false);
        return new ViewHolderAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderAdapter holder, int position) {
        holder.txtName.setText(listData.get(position));
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class ViewHolderAdapter extends RecyclerView.ViewHolder{
        TextView txtName;
        public ViewHolderAdapter(View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.textView);
        }
    }
}
