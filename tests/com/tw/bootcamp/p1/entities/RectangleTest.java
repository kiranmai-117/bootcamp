package com.tw.bootcamp.p1.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RectangleTest {
    @Test
    void shouldGiveAreaOfRectangle() {
        Shape rect = Rectangle.createRectangle(5, 5);

        double area = rect.area();
        assertEquals(25, area);
    }

    @Test
    void shouldGivePerimeterOfRectangle() {
        Shape rect = Rectangle.createRectangle(5, 5);
        double perimeter = rect.perimeter();

        assertEquals(20, perimeter);
    }

    @Test
    void shouldGiveAreaOfSquare() {
        Shape square = Rectangle.createSquare(10);
        double area = square.area();

        assertEquals(100, area);
    }

    @Test
    void shouldGivePerimeterOfSquare() {
        Shape square = Rectangle.createSquare(10);
        double perimeter = square.perimeter();

        assertEquals(40, perimeter);
    }
}
