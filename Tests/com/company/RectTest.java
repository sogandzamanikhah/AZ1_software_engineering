package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectTest {
    Rect rect = new Rect(2,3);
    @Test
    public void getArea() {
        assertEquals(6,rect.getArea());
    }
}
