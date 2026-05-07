package com.tw.bootcamp.p1.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RectangleTest {
    @Test
    void shouldGiveArea() {
        Rectangle rect = new Rectangle(5, 5);

        int area = rect.area();
        assertEquals(25, area);
    }
}
