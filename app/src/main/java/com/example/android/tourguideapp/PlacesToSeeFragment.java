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

/**
 * A simple {@link Fragment} subclass.
 */
public class PlacesToSeeFragment extends Fragment {

    RecyclerView mRecyclerView;
    AdapterItems mListAdapter;
    ArrayList<ItemModel> attraction;

    public PlacesToSeeFragment() {
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

        attraction.add(new ItemModel(R.string.place1_descr, R.drawable.placetosee1, R.string.place1));
        attraction.add(new ItemModel(R.string.place2_descr, R.drawable.placetosee2, R.string.place2));
        attraction.add(new ItemModel(R.string.place3_descr, R.drawable.placetosee3, R.string.place3));

    }

}