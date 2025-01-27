package com.example.yogaapp;

public class YogaPose {
    private String name;
    private int imageRes;

    public YogaPose(String name, int imageRes) {
        this.name = name;
        this.imageRes = imageRes;
    }

    public String getName() {
        return name;
    }

    public int getImageRes() {
        return imageRes;
    }
}
