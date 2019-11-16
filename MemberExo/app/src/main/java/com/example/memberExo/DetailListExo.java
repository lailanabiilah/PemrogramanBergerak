package com.example.memberExo;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailListExo extends AppCompatActivity {

    private int exo_id;
    ImageView imgDetail;
    TextView tvName, tvDesc;

    private ArrayList <Exo> listExo = new ArrayList<>();

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_list);


        exo_id = getIntent().getIntExtra("exo_id", 0);
        tvName = findViewById(R.id.name_detail);
        tvDesc = findViewById(R.id.desc_detail);
        imgDetail = findViewById(R.id.img_detail);

        listExo.addAll (ExoData.getListData());
        setLayout();
    }

    void setLayout(){
        this.setTitle(listExo.get(exo_id).getName());
        tvName.setText(listExo.get(exo_id).getName());
        tvDesc.setText(listExo.get(exo_id).getDescription());
        Glide.with(this)
                .load(listExo.get(exo_id).getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(imgDetail);
    }
}
