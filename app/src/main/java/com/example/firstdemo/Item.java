package com.example.firstdemo;

import android.media.Image;

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

    public  String getDuration(){
        String minS = ""+min;
        String secS = ""+sec;
        if(min<10){
            minS = "0"+min;
        }
        if(sec<10){
            secS = "0"+sec;
        }
        return minS + " : " + secS;
    }

    public String getName() {
        return name;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }

    public String getViews() {
        return views + " views";
    }

    public String getDescription() {
        return description;
    }

    public int getImgId() {

        return imgId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
