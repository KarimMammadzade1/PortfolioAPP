package com.example.portfoliokerim.Portfolio;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.portfoliokerim.R;

import java.util.List;

public class PortfolioAdapter extends RecyclerView.Adapter<PortfolioAdapter.ViewHolder> {

    List<PortfolioItem> mdata;
    PortfolioCallback listener;


    public PortfolioAdapter(List<PortfolioItem> mdata,PortfolioCallback listener) {
        this.mdata = mdata;
        this.listener=listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.itemportfolio,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(holder.itemView.getContext()).load(mdata.get(position).getImage()).into(holder.imgport);
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgport;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
           imgport=itemView.findViewById(R.id.item_portfolio_img);
           itemView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   listener.onPortfolioItemClick(getAdapterPosition());
               }
           });

        }
    }
}
