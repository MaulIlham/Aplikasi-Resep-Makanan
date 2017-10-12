package com.example.schiffers.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TampilanDetil extends AppCompatActivity {
    ImageView gambar;
    TextView txtres,txtdes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_detil);
        Bundle b=getIntent().getExtras();
        txtres=(TextView) findViewById(R.id.textresep);
        txtdes=(TextView)findViewById(R.id.textprod);
        gambar=(ImageView)findViewById(R.id.imagedeti);
        txtres.setText(b.getString("res"));
        txtdes.setText(b.getString("procedur"));
        gambar.setImageResource(b.getInt("gambar"));
        setTitle(b.getString("label"));
    }
}
