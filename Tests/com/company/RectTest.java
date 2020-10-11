package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectTest {

    @Test
    public void getArea() {
        Rect rect = new Rect(2,3);
        assertEquals(6,rect.getArea());
    }

    @Test
    public void setWidth() {
        Rect rect = new Rect(2,3);
        rect.setWidth(5);
        assertEquals(5,rect.getWidth());
    }

    @Test
    public void getWidth() {
        Rect rect = new Rect(2,3);
        assertEquals(3,rect.getWidth());
    }

    @Test
    public void setHeight() {
        Rect rect = new Rect(2,3);
        rect.setHeight(4);
        assertEquals(4,rect.getHeight());
    }

    @Test
    public void getHeight()  {
        Rect rect = new Rect(2,3);
        assertEquals(2,rect.getHeight());
    }
}
