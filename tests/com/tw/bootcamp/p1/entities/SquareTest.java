package com.tw.bootcamp.p1.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    @Test
    void shouldGiveArea() {
        Square square = new Square(10);
        int area = square.area();

        assertEquals(100, area);
    }

    @Test
    void shouldGivePerimeter() {
        Square square = new Square(10);
        int perimeter = square.perimeter();

        assertEquals(40, perimeter);
    }


}
