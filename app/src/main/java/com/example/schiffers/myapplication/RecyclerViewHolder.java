package com.example.schiffers.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    TextView txt1,txt2;
    public RecyclerViewHolder(View itemView) {
        super(itemView);
        txt1=(TextView)itemView.findViewById(R.id.textjudul);
        txt2=(TextView)itemView.findViewById(R.id.textdeskripsi);
    }
}