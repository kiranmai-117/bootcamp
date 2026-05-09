package com.tw.bootcamp.p5;

import java.util.HashMap;
import java.util.Map;

public class Bag {
    private final int capacity;
    private final Map<Ball, Integer> balls;
    private int ballCount;

    public Bag() {
        this.ballCount = 0;
        this.capacity = 12;
        this.balls = new HashMap<>();
    }

    public boolean add(Ball ball) {
        if (ballCount >= capacity) {
            return false;
        }

        balls.compute(ball, (k, val) -> val == null ? 1 : val + 1);
        ballCount++;
        return true;
    }
}
