package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public class LocalMonumentsFragment extends Fragment {

    RecyclerView mRecyclerView;
    AdapterItems mListAdapter;
    ArrayList<ItemModel> attraction;


    public LocalMonumentsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.itemlistlayout, container, false);

        mRecyclerView = view.findViewById(R.id.recyclerV);
        getItemsList();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        mListAdapter = new AdapterItems(getContext(), attraction, mRecyclerView);
        mRecyclerView.setAdapter(mListAdapter);

        return view;
    }

    public void getItemsList() {
        attraction = new ArrayList<>();

        attraction.add(new ItemModel(R.string.monument1_descr, R.drawable.monument1, R.string.monument1));
        attraction.add(new ItemModel(R.string.monument2_descr, R.drawable.monument2, R.string.monument2));
        attraction.add(new ItemModel(R.string.monument3_descr, R.drawable.monument3, R.string.monument3));

    }


}
