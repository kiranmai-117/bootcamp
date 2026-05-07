package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChanceTest {
    @Test
    void shouldRepresentTheChanceOfGettingTailForOneCoin() {
        Chance chance = new Chance(2, 1);
        assertEquals(0.5, chance.getProbability());

    }
}
