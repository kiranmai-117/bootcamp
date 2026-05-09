package com.tw.bootcamp.p5;

public enum Ball {
    BLUE(12), GREEN(3), RED(12), YELLOW(12);

    private final int limit;

    Ball(int limit) {
        this.limit = limit;
    }

    public boolean isLimitExceeds(int count) {
        return count >= limit;
    }
}
