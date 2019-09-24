package com.example.MyIntentApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Main2Activity extends AppCompatActivity {
    Button btnHalaman2;
    EditText etData1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        etData1 = findViewById(R.id.et_data1);

        btnHalaman2 = findViewById(R.id.btn_halaman);

        btnHalaman2.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick (View view){
                String data  = etData1.getText().toString();
                startActivity( new Intent(Main2Activity.this, halaman2.class).putExtra("Data", data));
            }
        });
    }
}

