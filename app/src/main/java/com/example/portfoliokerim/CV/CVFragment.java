package com.example.portfoliokerim.CV;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.portfoliokerim.R;

import java.util.ArrayList;
import java.util.List;

public class CVFragment extends Fragment {

    RecyclerView rvcv;
    CVAdapter adapter;
    List<CVItem> items;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_cv, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvcv=view.findViewById(R.id.recyclerview_cv);
        items=new ArrayList<>();
        items.add(new CVItem("15 September 2006","First Step To Academic Life-School"));
        items.add(new CVItem("7 March 2012","Festival of Brotherhood-Georgia"));
        items.add(new CVItem("15 September 2017","Second Step Of Academic Life-University"));
        items.add(new CVItem("12 October 2020","Portfolio App Created :)  \n \n \n \n \n \n \n "));

        adapter=new CVAdapter(items);
        rvcv.setLayoutManager(new LinearLayoutManager(getContext()));
        rvcv.setAdapter(adapter);
    }




}
