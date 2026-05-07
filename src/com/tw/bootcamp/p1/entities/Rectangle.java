package com.tw.bootcamp.p1.entities;

public class Rectangle {

    private final int length;
    private final int breath;

    public Rectangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    public int area() {
        return length * breath;
    }
}
