package com.example.portfoliokerim.Team;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.portfoliokerim.R;

import org.w3c.dom.Text;

import java.util.List;
import java.util.zip.Inflater;

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.ViewHolder> {

    List<TeamItem> mdata;

    public TeamAdapter(List<TeamItem> mdata) {
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public TeamAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
          View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.itemteam,parent,false);
          return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TeamAdapter.ViewHolder holder, int position) {
          holder.tvname.setText(mdata.get(position).getName());
          holder.tvdesc.setText(mdata.get(position).getDesc());
          holder.img.setImageResource(mdata.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
TextView tvname,tvdesc;
ImageView img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        tvname=itemView.findViewById(R.id.teamitemname);
            tvdesc=itemView.findViewById(R.id.teamitemdesc);
            img=itemView.findViewById(R.id.teamitemimg);

        }
    }
}
