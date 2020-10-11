package com.company;

public class Main {

    public static void main(String[] args) {
        Rect rect = new Rect(2,3);
        rect.setWidth(2);
        System.out.println(rect.getWidth());
        System.out.println(rect.getArea());
        Square square = new Square(2);
        square.setHeight(4);
        System.out.println(square.getArea());
    }
}
