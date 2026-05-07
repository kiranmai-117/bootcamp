package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ChanceTest {
    @Test
    void shouldRepresentTheChanceOfGettingTailForOneCoin() {
        assertEquals(Chance.create(0.5), Chance.create(0.5));
    }

    @Test
    void shouldRepresentTheChanceOfNotGettingTailForOneCoin() {
        Chance chanceOfGettingTails = Chance.create(0.5);
        Chance chanceOfGettingHeads = chanceOfGettingTails.complement();
        assertEquals(Chance.create(0.5), chanceOfGettingHeads);
    }

    @Test
    void shouldRepresentTheChanceOfGettingTailsForTwoCoins() {
        Chance chanceOfGettingTailsOfOneCoin = Chance.create(0.5);
        Chance chanceOfGettingTailsOfOtherCoin = Chance.create(0.5);
        Chance chanceOfGettingTailsForTwoCoins = chanceOfGettingTailsOfOneCoin.and(chanceOfGettingTailsOfOtherCoin);
        assertEquals(Chance.create(0.25), chanceOfGettingTailsForTwoCoins);
    }

    @Test
    void shouldRepresentTheChanceOfGettingAtLeastOneTailsForTwoCoins() {
        Chance chanceOfGettingTailsOfOneCoin = Chance.create(0.5);
        Chance chanceOfGettingTailsOfOtherCoin = Chance.create(0.5);
        Chance chanceOfGettingTailsForTwoCoins = chanceOfGettingTailsOfOneCoin.or(chanceOfGettingTailsOfOtherCoin);
        assertEquals(Chance.create(0.75), chanceOfGettingTailsForTwoCoins);
    }

    @Test
    void shouldRepresentTheChanceOfGettingAtLeastOneTailsForThreeCoins() {
        Chance chanceOfGettingTailsOfOneCoin = Chance.create(0.5);
        Chance chanceOfGettingTailsOfSecondCoin = Chance.create(0.5);
        Chance chanceOfGettingTailsOfThirdCoin = Chance.create(0.5);

        Chance chanceOfGettingAtLeastTailsForTwoCoins = chanceOfGettingTailsOfOneCoin.or(chanceOfGettingTailsOfSecondCoin);
        Chance chanceOfGettingAtLeastTailsForThreeCoins = chanceOfGettingAtLeastTailsForTwoCoins.or(chanceOfGettingTailsOfThirdCoin);
        assertEquals(Chance.create(0.875), chanceOfGettingAtLeastTailsForThreeCoins);
    }

    @Test
    void shouldRepresentTheChanceOfGettingThreeOnADice() {
        Chance chanceOfGettingThree = Chance.create(0.167);
        assertEquals(Chance.create(0.167), chanceOfGettingThree);
    }

    @Test
    void shouldThrowErrorForIllegalChanceValue() {
        assertThrows(IllegalArgumentException.class, () -> Chance.create(-13));
    }
}
