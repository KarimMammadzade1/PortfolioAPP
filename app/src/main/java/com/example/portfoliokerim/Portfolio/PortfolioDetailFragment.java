package com.example.portfoliokerim.Portfolio;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.portfoliokerim.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class PortfolioDetailFragment extends BottomSheetDialogFragment {
    private ImageView imgportfolio;
    private TextView title, desription;


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_portfolio_detail, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        imgportfolio = view.findViewById(R.id.portfoliodetailimg);
        title = view.findViewById(R.id.portfoliodetalititle);
        desription = view.findViewById(R.id.portfoliodetaildesc);


        Bundle bundle=getArguments();
        PortfolioItem item=(PortfolioItem) bundle.getSerializable("object");
     loadPorfolioData(item);

    }
    void loadPorfolioData(PortfolioItem item){
        Glide.with(getContext()).load(item.getImage()).into(imgportfolio);
    }

}
