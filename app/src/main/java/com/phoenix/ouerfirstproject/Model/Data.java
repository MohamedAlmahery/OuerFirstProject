package com.phoenix.ouerfirstproject.Model;

public class Data {
    private String txt;
    private int image;

    public Data() {
    }

    public Data(String txt, int image) {
        this.txt = txt;
        this.image = image;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

}
