package com.example.android.tourguideapp;

public class ItemModel {

    private int description;
    private int img;
    private int title;

    public ItemModel(int description, int img, int title) {
        this.description = description;
        this.img = img;
        this.title = title;
    }

    public int getMyDescription() {
        return description;
    }

    public int getMyTitle() {
        return title;
    }

    public int getMyImage() {
        return img;
    }
}
