package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinTest {
    @Test
    void shouldReturnProbabilityOfGettingTail() {
        double probabilityOfTails = Coin.getProbabilityOfTails();

        assertEquals(0.5, probabilityOfTails);
    }

    @Test
    void shouldReturnProbabilityOfGettingHead() {
        double probabilityOfHeads = Coin.getProbabilityOfHead();

        assertEquals(0.5, probabilityOfHeads);
    }
}
