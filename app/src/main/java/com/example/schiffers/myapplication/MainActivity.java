package com.example.schiffers.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    String txt1[],txt2[],txt3[],txt4[];
    RecyclerView recycl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycl= (RecyclerView) findViewById(R.id.recyclerview);
        txt1=getResources().getStringArray(R.array.nameresep);
        txt2=getResources().getStringArray(R.array.deskripsi);
        txt3=getResources().getStringArray(R.array.resep);
        txt4=getResources().getStringArray(R.array.carapem);
        RecyclerAdapter adapter=new RecyclerAdapter(this,txt1,txt2,txt3,txt4);
        recycl.setAdapter(adapter);
        recycl.setHasFixedSize(true);
        recycl.setLayoutManager(new LinearLayoutManager(this));

    }
}
