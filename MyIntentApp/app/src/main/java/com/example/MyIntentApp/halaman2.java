package com.example.MyIntentApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class halaman2 extends AppCompatActivity {
    TextView tvData1;
    String out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);

        tvData1= findViewById(R.id.tv_data1);

        out= getIntent().getStringExtra("Data");
        tvData1.setText(out);

    }
}
