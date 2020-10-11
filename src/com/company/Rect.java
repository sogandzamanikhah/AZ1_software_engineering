package com.company;

public class Rect extends Shape {

    private int height;
    private  int width;

    public Rect(int height,int width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;

    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public int getArea(){
        int Area = 0;
        Area = height * width;
        return Area;
    }


}
