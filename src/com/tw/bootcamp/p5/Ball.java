package com.tw.bootcamp.p5;

import java.util.function.UnaryOperator;

public enum Ball {
    BLUE((x) -> 12),
    GREEN((x) -> 3),
    RED((x) -> 2 * x),
    YELLOW((x) -> 12);

    private UnaryOperator<Integer> action;

    Ball(UnaryOperator<Integer> action) {
        this.action = action;
    }

    public boolean isLimitReached(int count, int dependencyCount) {
        Integer limit = action.apply(dependencyCount);
        return count >= limit;
    }
}
