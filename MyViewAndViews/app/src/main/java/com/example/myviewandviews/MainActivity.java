package com.example.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnDonasi;
    EditText editctt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar()!=null) {
            getSupportActionBar().setTitle("Donasi");
        }

        btnDonasi=findViewById(R.id.btn_donasi);

        btnDonasi.setOnClickListener(this);


        }
     @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn_donasi:
                Intent donasiActivity = new Intent(MainActivity.this, com.example.myviewandviews.donasiActivity.class);
                startActivity(donasiActivity);
                break;
        }

    }
}
