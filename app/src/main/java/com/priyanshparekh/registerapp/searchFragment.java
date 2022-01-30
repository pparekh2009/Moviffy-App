package com.priyanshparekh.registerapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class searchFragment extends Fragment {

    public searchFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_search, container, false);

        RecyclerView genreRecyclerView = view.findViewById(R.id.genre_recycler_view);
        genreRecyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        genreRecyclerView.setAdapter(new GenreRecyclerViewAdapter());
        genreRecyclerView.setHasFixedSize(true);

        RecyclerView langRecyclerView = view.findViewById(R.id.lang_recycler_view);
        langRecyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        langRecyclerView.setAdapter(new LangRecyclerViewAdapter());
        langRecyclerView.setHasFixedSize(true);
        return view;
    }
}