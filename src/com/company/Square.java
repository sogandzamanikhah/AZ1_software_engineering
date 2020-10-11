package com.company;

public class Square extends Shape {

    private int height;

    public Square (int height) {
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;

    }

    public int getHeight() {
        return height;

    }

    @Override
    int getArea() {
        int Area = 0;
        Area = height * height;
        return Area;
    }
}