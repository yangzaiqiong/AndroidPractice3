package com.example.androidpractice3;

public class Animal {
    private  String name;
    private  int imageId;

    public Animal(String name, int imageId){
        this.name = name;
        this.imageId = imageId;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
