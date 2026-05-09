package com.tw.bootcamp.p5;

import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RulesTest {
    @Test
    void shouldFollowMaximumAllowedRule() {
        Rule mockRule = mock(Rule.class);
        Map<Ball, Integer> balls = new LinkedHashMap<>();
        balls.put(Ball.BLUE, 2);
        BallsState ballsState = new BallsState(balls);

        when(mockRule.isSatisfied(ballsState)).then((Answer<Boolean>) invocation -> {
            int sum = Arrays.stream(Ball.values()).map(ballsState::getCount).mapToInt(Integer::intValue).sum();
            return sum <= 1;
        });

        assertFalse(mockRule.isSatisfied(ballsState));
    }
}
