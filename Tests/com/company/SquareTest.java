package com.company;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {
    Square square = new Square(3);
    @Test
    public void setHeight() {
        square.setHeight(4);
        assertEquals(4,square.getHeight());
    }

    @Test
    public void getHeight() {
        assertEquals(3,square.getHeight());
    }

    @Test
    public void getArea() {
        assertEquals(9,square.getArea());
    }
}