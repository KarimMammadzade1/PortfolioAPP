package com.example.portfoliokerim.CV;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.portfoliokerim.R;

import java.util.List;

public class CVAdapter extends RecyclerView.Adapter<CVAdapter.CVAdapterViewHolder> {
    List<CVItem> mdata;

    public CVAdapter(List<CVItem> mdata) {
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public CVAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cv, parent, false);
        return new CVAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CVAdapterViewHolder holder, int position) {
        holder.TvDescription.setText(mdata.get(position).getDescriptions());
        holder.tvTitle.setText(mdata.get(position).getTitle());


    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class CVAdapterViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle, TvDescription;

        public CVAdapterViewHolder(@NonNull View itemView) {

            super(itemView);
            tvTitle = itemView.findViewById(R.id.item_cv_title);
            TvDescription = itemView.findViewById(R.id.item_cv_desc);


        }
    }


}
