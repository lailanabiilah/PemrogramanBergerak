package com.example.signupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class loginActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnDaftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnDaftar=findViewById(R.id.btnRegister);
        btnDaftar.setOnClickListener(this);
    }

    @Override
    public void onClick (View view){
        switch (view.getId()){
            case R.id.btnRegister:
                Intent MainActivity=new Intent(loginActivity.this,MainActivity.class);
                startActivity(MainActivity);
                break;
        }
    }
}
