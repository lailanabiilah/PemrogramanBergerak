package com.example.MyIntentApp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnMoveActivity;
    Button btnMoveActivityWithData;
    Button btnDial;
    Button btnWeb;
    Button btnMoveA2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity=findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        btnMoveActivityWithData = findViewById(R.id.btn_move_data);
        btnMoveActivityWithData.setOnClickListener(this);

        btnDial = findViewById(R.id.btn_dial);
        btnDial.setOnClickListener(this);

        btnWeb = findViewById(R.id.btn_web);
        btnWeb.setOnClickListener(this);

        btnMoveA2= findViewById(R.id.btn_MoveA2);
        btnMoveA2.setOnClickListener(this);

    }

    @Override
        public void onClick(View view){
            switch (view.getId()){
                case R.id.btn_move_activity:
                    Intent MoveActivity = new Intent( MainActivity.this,activity_new.class);
                    startActivity(MoveActivity);
                    break;
                case R.id.btn_move_data:
                    Intent moveWithData = new Intent(MainActivity.this,MainActivityWithData.class);
                    moveWithData.putExtra(MainActivityWithData.EXTRA_NAME, "L. Nabiilah");
                    moveWithData.putExtra(MainActivityWithData.EXTRA_AGE,19);
                    startActivity(moveWithData);
                    break;
                case R.id.btn_dial:
                    String phoneNumber = "082280747337";
                    Intent dialPhone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                    startActivity(dialPhone);
                    break;
                case R.id.btn_web:
                    Intent webya = new Intent(Intent.ACTION_VIEW, Uri.parse("http://polines.ac.id"));
                    startActivity(webya);
                    break;
                case R.id.btn_MoveA2:
                    Intent moveHalaman = new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(moveHalaman);
                    break;
            }
    }

}
