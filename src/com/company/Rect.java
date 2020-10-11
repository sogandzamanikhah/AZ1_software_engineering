package com.company;

public class Rect extends Shape {

    private int height;
    private  int width;

    public Rect(int height,int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public int getArea(){
        int Area = 0;
        Area = height * width;
        return Area;
    }


}
