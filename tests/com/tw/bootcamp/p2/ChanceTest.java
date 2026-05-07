package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChanceTest {
    @Test
    void shouldRepresentTheChanceOfGettingTailForOneCoin() {
        assertEquals(new Chance(0.5), new Chance(0.5));
    }

    @Test
    void shouldRepresentTheChanceOfNotGettingTailForOneCoin() {
        Chance chanceOfGettingTails = new Chance(0.5);
        Chance chanceOfGettingHeads = chanceOfGettingTails.complement();
        assertEquals(new Chance(0.5), chanceOfGettingHeads);
    }
}
