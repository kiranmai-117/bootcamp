package com.tw.bootcamp.p5;

public class Bag {
    private final int capacity;
    private int ballCount;

    public Bag() {
        this.ballCount = 0;
        this.capacity = 12;
    }

    public boolean add() {
        if (ballCount >= capacity) {
            return false;
        }

        ballCount++;
        return true;
    }
}
