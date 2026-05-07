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

    @Test
    void shouldRepresentTheChanceOfGettingTailsForTwoCoins() {
        Chance chanceOfGettingTailsOfOneCoin = new Chance(0.5);
        Chance chanceOfGettingTailsOfOtherCoin = new Chance(0.5);
        Chance chanceOfGettingTailsForTwoCoins = chanceOfGettingTailsOfOneCoin.and(chanceOfGettingTailsOfOtherCoin);
        assertEquals(new Chance(0.25), chanceOfGettingTailsForTwoCoins);
    }

    @Test
    void shouldRepresentTheChanceOfGettingAtLeastOneTailsForTwoCoins() {
        Chance chanceOfGettingTailsOfOneCoin = new Chance(0.5);
        Chance chanceOfGettingTailsOfOtherCoin = new Chance(0.5);
        Chance chanceOfGettingTailsForTwoCoins = chanceOfGettingTailsOfOneCoin.and(chanceOfGettingTailsOfOtherCoin);
        assertEquals(new Chance(0.75), chanceOfGettingTailsForTwoCoins.complement());
    }

    @Test
    void shouldRepresentTheChanceOfGettingAtLeastOneTailsForThreeCoins() {
        Chance chanceOfGettingTailsOfOneCoin = new Chance(0.5);
        Chance chanceOfGettingTailsOfSecondCoin = new Chance(0.5);
        Chance chanceOfGettingTailsOfThirdCoin = new Chance(0.5);

        Chance chanceOfGettingTailsForTwoCoins = chanceOfGettingTailsOfOneCoin.and(chanceOfGettingTailsOfSecondCoin);
        Chance chanceOfGettingTailsForThreeCoins = chanceOfGettingTailsForTwoCoins.and(chanceOfGettingTailsOfThirdCoin);
        assertEquals(new Chance(0.875), chanceOfGettingTailsForThreeCoins.complement());
    }

    @Test
    void shouldRepresentTheChanceOfGettingThreeOnADice() {
        Chance chanceOfGettingThree = new Chance(0.167);
        assertEquals(new Chance(0.167), chanceOfGettingThree);
    }
}
