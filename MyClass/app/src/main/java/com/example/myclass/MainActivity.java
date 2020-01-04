package com.example.myclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button LihatData = findViewById(R.id.lihatbtn);
        Button InputData = findViewById(R.id.inputbtn);
        Button Informasi = findViewById(R.id.infotbtn);
        LihatData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, DataBiodata.class);
                startActivity(intent);
            }
        });
        InputData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, InputData.class);
                startActivity(intent);
            }
        });
        Informasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, Informasi.class);
                startActivity(intent);
            }
        });
    }
}
