package com.tw.bootcamp.p1.entities;

public class Rectangle implements Shape {

    private final double length;
    private final double breath;

    private Rectangle(double length, double breath) {
        this.length = length;
        this.breath = breath;
    }

    public static Rectangle createRectangle(double length, double breath) {
        return new Rectangle(length, breath);
    }

    public static Rectangle createSquare(double side) {
        return createRectangle(side, side);
    }

    @Override
    public double area() {
        return length * breath;
    }

    @Override
    public double perimeter() {
        return 2 * (length + breath);
    }
}
