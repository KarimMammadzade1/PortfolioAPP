package com.example.portfoliokerim.Team;

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

public class FragmentTeam extends Fragment {
    RecyclerView rvteam;
    TeamAdapter adapter;
    List<TeamItem> mdata;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_team, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvteam = view.findViewById(R.id.rvteam);

        TeamItem item = new TeamItem("Kerim Memmedzade", "Mobile Developer of Team", R.drawable.circlekerim);
        TeamItem item2 = new TeamItem("Murad Hasanov", "Designer of Team", R.drawable.circlemurad);
        TeamItem item3 = new TeamItem("Ersad Ersadli", "Web Developer of Team", R.drawable.circleersad);
        TeamItem item4 = new TeamItem("Johny Cash", "We Dont Know That Guy", R.drawable.circleuser3);
        TeamItem item5 = new TeamItem("Robert Downey JR ", "Super Hero of Team", R.drawable.circlerobert);
        TeamItem item6 = new TeamItem("Cumshud Gulizade", "Useless Part of Team", R.drawable.circlecumsud2);


        mdata = new ArrayList<>();
        mdata.add(item);
        mdata.add(item2);
        mdata.add(item3);
        mdata.add(item4);
        mdata.add(item5);
        mdata.add(item6);
//        mdata.add(item3);

        adapter = new TeamAdapter(mdata);
        rvteam.setAdapter(adapter);
        rvteam.setLayoutManager(new LinearLayoutManager(getContext()));


    }
}
