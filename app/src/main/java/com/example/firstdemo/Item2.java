package com.example.firstdemo;

public class Item2 {

    private  String text;
    private int imgId;

    public Item2(String text, int imgId){
        this.text = text;
        this.imgId = imgId;
    }

    public int getImgId() {
        return imgId;
    }

    public String getText() {
        return text;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public void setText(String text) {
        this.text = text;
    }
}
