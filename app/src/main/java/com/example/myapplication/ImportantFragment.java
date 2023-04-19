package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ImportantFragment extends Fragment {

    View view;
    RecyclerView recyclerView;
    ArrayList<Item> items;
    MainActivity activity;
    Adapter adapter;

    public ImportantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_important, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);

        activity = (MainActivity) getActivity();
        items = activity.getImportantItems();

        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(new Adapter(view.getContext(), items));

       return view;
    }
}