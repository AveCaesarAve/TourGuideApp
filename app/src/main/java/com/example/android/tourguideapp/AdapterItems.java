package com.example.android.tourguideapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class AdapterItems extends RecyclerView.Adapter<ItemViewKeeper> {

    private ArrayList<ItemModel> myItemModel;
    private Context context;
    private int mExpandedPosition = -1;
    private RecyclerView recView;

    public AdapterItems(Context context, ArrayList<ItemModel> myItemModel, RecyclerView recView) {
        this.context = context;
        this.myItemModel = myItemModel;
        this.recView = recView;
    }

    @NonNull
    @Override
    public ItemViewKeeper onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View currentView = LayoutInflater.from(context).inflate(R.layout.elementonthelist, parent, false);
        return new ItemViewKeeper(currentView);
    }

    @Override
    public void onBindViewHolder(@NonNull final ItemViewKeeper holder, int position) {

        holder.myTextTitle.setText(myItemModel.get(position).getMyTitle());
        holder.myImage.setImageResource(myItemModel.get(position).getMyImage());
        holder.myTextDescription.setText(myItemModel.get(position).getMyDescription());

        final boolean isExpanded = position == mExpandedPosition;
        holder.myTextDescription.setVisibility(isExpanded ? View.VISIBLE : View.GONE);
        holder.itemView.setActivated(isExpanded);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View v) {
                mExpandedPosition = isExpanded ? -1 : holder.getAdapterPosition();
                TransitionManager.beginDelayedTransition(recView);
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return myItemModel.size();
    }
}