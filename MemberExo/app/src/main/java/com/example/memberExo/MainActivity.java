package com.example.memberExo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvexo;
    private ArrayList<Exo> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() !=null) {
            getSupportActionBar().setTitle("EXO");
        }

        rvexo = findViewById(R.id.rv_exo);
        rvexo.setHasFixedSize(true);

        list.addAll(ExoData.getListData());
        showRecycleList();
    }

    private void showRecycleList() {
        rvexo.setLayoutManager(new LinearLayoutManager(this));
        CardExoAdapter cardExoAdapter = new CardExoAdapter(this, list);
        rvexo.setAdapter(cardExoAdapter);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()==R.id.iconProfil){
            startActivity(new Intent(MainActivity.this, profil.class));
        }
        return true;
    }
}
