package com.tw.bootcamp.p5;

import java.util.HashMap;
import java.util.Map;

public class Bag {
    private final int capacity;
    private final Map<Ball, Integer> balls;
    private int totalBallCount;

    public Bag() {
        this.totalBallCount = 0;
        this.capacity = 12;
        this.balls = new HashMap<>();
    }

    public boolean add(Ball ball) {
        int ballCount = balls.getOrDefault(ball, 0);
        if (isLimitReached(ball, ballCount)) return false;

        balls.put(ball, ballCount + 1);
        this.totalBallCount++;
        return true;
    }

    private boolean isLimitReached(Ball ball, int ballCount) {
        if (this.totalBallCount >= capacity) return false;

        return switch (ball) {
            case RED -> ballCount >= balls.getOrDefault(Ball.GREEN, 0) * 2;
            case GREEN -> ballCount >= 3;
            case BLUE -> ballCount >= 12;
            case YELLOW -> ballCount >= totalBallCount * 0.4;
        };
    }
}
