package com.tw.bootcamp.p1.entities;

public class Rectangle implements Shape {

    private final int length;
    private final int breath;

    public Rectangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    @Override
    public int area() {
        return length * breath;
    }

    @Override
    public int perimeter() {
        return 2 * (length + breath);
    }
}
