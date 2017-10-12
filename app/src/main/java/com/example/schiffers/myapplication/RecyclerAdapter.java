package com.example.schiffers.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    private final Context context;
    String data1[],data2[],data3[],data4[];
    int gambar[] = {R.drawable.burger, R.drawable.kebab, R.drawable.ayamgeprek, R.drawable.crepes, R.drawable.kentanggoreng};
    LayoutInflater inflater;

    public RecyclerAdapter(Context context,String tx1[],String tx2[],String tx3[],String tx4[]) {
        this.context = context;
        inflater=LayoutInflater.from(context);
        data1=tx1;
        data2=tx2;
        data3=tx3;
        data4=tx4;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.tampilanrecycler, parent, false);

        RecyclerViewHolder viewHolder = new RecyclerViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.txt1.setText(data1[position]);
        holder.txt1.setOnClickListener(clickListener);
        holder.txt2.setText(data2[position]);
        holder.txt2.setOnClickListener(clickListener);
        holder.txt1.setTag(holder);
        holder.txt2.setTag(holder);
    }

    View.OnClickListener clickListener =new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            RecyclerViewHolder vholder = (RecyclerViewHolder) v.getTag();
            int position = vholder.getPosition();
            Bundle b = new Bundle();
            b.putInt("gambar", gambar[position]);
            b.putString("res", data3[position]);
            b.putString("procedur", data4[position]);
            b.putString("label", "Resep " + data1[position]);
            Intent intent = new Intent(context, TampilanDetil.class);
            intent.putExtras(b);
            context.startActivity(intent);
        }
    };

    @Override
    public int getItemCount() {
        return data1.length;
    }
}
