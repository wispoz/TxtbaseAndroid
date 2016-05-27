package com.wispoz.txtbase.views.dancers;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wispoz.txtbase.R;
import com.wispoz.txtbase.adapters.CompetitionAdapter;
import com.wispoz.txtbase.models.Competition;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wispoz on 27.05.16.
 */
public class DancersView extends Fragment {
    private List<Competition> competitions;
    private RecyclerView rv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.competitions, container, false);
        RecyclerView rv = (RecyclerView)view.findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(container.getContext());
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);
        initializeData();
        CompetitionAdapter adapter = new CompetitionAdapter(competitions);
        rv.setAdapter(adapter);
        return view;
    }

    private void initializeData() {
        competitions = new ArrayList<>();
        for(int i = 0; i<25; i++ ) {
            competitions.add(new Competition(i,"Чемпионат России","31-01-2016",i));

        }
    }
    private void initializeAdapter(){

    }
}