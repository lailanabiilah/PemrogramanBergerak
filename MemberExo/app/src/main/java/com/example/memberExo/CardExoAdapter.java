package com.example.memberExo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardExoAdapter extends RecyclerView.Adapter<CardExoAdapter.ListViewHolder> {

    private ArrayList<Exo> listExo;
    private Context context;

    public CardExoAdapter(Context context, ArrayList<Exo> listExo){
        this.listExo = listExo;
        this.context = context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        final Exo exo = listExo.get(position);
        Glide.with(holder.itemView.getContext())
                .load(exo.getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(holder.imgPhoto);
        holder.tvName.setText(exo.getName());
        holder.tvDesc.setText(exo.getDescription());

        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detailExo = new Intent(context, DetailListExo.class);
                detailExo.putExtra("exo_id", exo.getId());
                context.startActivity(detailExo);
            }
        });
    }

    @Override
    public int getItemCount()
    {
        return listExo.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDesc;
        CardView cv;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_exo_list);
            tvName = itemView.findViewById(R.id.name_exo_list);
            tvDesc = itemView.findViewById(R.id.desc_exo_list);
            cv = itemView.findViewById(R.id.cardview_item);
        }
    }
}
