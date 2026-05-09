package com.tw.bootcamp.p5;

import java.util.Map;

public class BallsState {
    private final Map<Ball, Integer> balls;

    public BallsState(Map<Ball, Integer> balls) {
        this.balls = balls;
    }

    public int getCount(Ball ball) {
        return balls.getOrDefault(ball, 0);
    }
}
