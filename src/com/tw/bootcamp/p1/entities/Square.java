package com.tw.bootcamp.p1.entities;

public class Square implements Shape {
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int area() {
        return side * side;
    }

    @Override
    public int perimeter() {
        return 4 * side;
    }
}
