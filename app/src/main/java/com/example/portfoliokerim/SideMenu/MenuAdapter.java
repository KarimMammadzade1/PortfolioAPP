package com.example.portfoliokerim.SideMenu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.portfoliokerim.R;

import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {
    List<MenuItem> mdata;
    Callback listener;

    public MenuAdapter(List<MenuItem> mdata, Callback listener) {
        this.mdata = mdata;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemmenu, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.icon.setImageResource(mdata.get(position).getIcon());
        if (mdata.get(position).isSelected()) {
            holder.isSelected.setVisibility(View.VISIBLE);
        } else {
            holder.isSelected.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView icon, isSelected;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.itemmenuicon);
            isSelected = itemView.findViewById(R.id.itemmenuselected);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   listener.onSideMenuitemclick(getAdapterPosition());
                }
            });

        }
    }
}
