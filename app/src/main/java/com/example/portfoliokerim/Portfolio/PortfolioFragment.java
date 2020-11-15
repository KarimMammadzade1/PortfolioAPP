package com.example.portfoliokerim.Portfolio;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.portfoliokerim.R;

import java.util.ArrayList;
import java.util.List;


public class PortfolioFragment extends Fragment implements PortfolioCallback {

List<PortfolioItem> mdata;
RecyclerView rvportfolio;
PortfolioAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_portfolio, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvportfolio=view.findViewById(R.id.rvportfolio);

        mdata= new ArrayList<>();
        mdata.add(new PortfolioItem(R.drawable.project1));
        mdata.add(new PortfolioItem(R.drawable.project2));
        mdata.add(new PortfolioItem(R.drawable.project3));
        mdata.add(new PortfolioItem(R.drawable.project4));
        mdata.add(new PortfolioItem(R.drawable.project5));
        mdata.add(new PortfolioItem(R.drawable.project6));
        mdata.add(new PortfolioItem(R.drawable.project7));
        mdata.add(new PortfolioItem(R.drawable.project8));
        mdata.add(new PortfolioItem(R.drawable.project9));

             adapter=new PortfolioAdapter(mdata,this);

             rvportfolio.setLayoutManager(new GridLayoutManager(getActivity(),3));
             rvportfolio.setAdapter(adapter);
    }

    @Override
    public void onPortfolioItemClick(int pos) {

        PortfolioDetailFragment portfolioDetailFragment=new PortfolioDetailFragment();
        Bundle bundle=new Bundle();
        bundle.putSerializable("object",mdata.get(pos));
        portfolioDetailFragment.setArguments(bundle);
        portfolioDetailFragment.show(getActivity().getSupportFragmentManager(),"tagname");

    }
}
