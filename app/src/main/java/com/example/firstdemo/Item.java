package com.example.firstdemo;

public class Item {

    private String name;
    private int min;
    private int sec;
    private int views;
    private String description;
    private int imgId;

    public Item(String name, int min, int sec, int views, String description, int imgId){
        this.name = name;
        this.min = min;
        this.sec = sec;
        this.views = views;
        this.description = description;
        this.imgId = imgId;
    }
}
