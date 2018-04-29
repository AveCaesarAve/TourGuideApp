package com.example.android.tourguideapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemViewKeeper extends RecyclerView.ViewHolder{

    TextView myTextDescription;
    TextView myTextTitle;
    ImageView myImage;

    public ItemViewKeeper(View itemView) {
        super(itemView);
        myTextDescription= itemView.findViewById(R.id.placeDescription);
        myTextTitle = itemView.findViewById(R.id.myTitleText);
        myImage = itemView.findViewById(R.id.myTitleImage);
    }
}
