package com.tw.bootcamp.p5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BagTest {
    @Test
    void shouldAddBallToTheBag() {
        Bag bag = new Bag();
        assertTrue(bag.add(Ball.GREEN));
    }

    @Test
    void shouldNotAddBallToTheBagIfItIsFull() {
        Bag bag = new Bag();
        for (int i = 0; i < 12; i++) {
            bag.add(Ball.RED);
        }
        assertFalse(bag.add(Ball.RED));
    }


    @Test
    void shouldNotAddMoreThanThreeGreenBallsToTheBag() {
        Bag bag = new Bag();
        for (int i = 0; i < 3; i++) {
            bag.add(Ball.GREEN);
        }

        assertFalse(bag.add(Ball.GREEN));
    }

    @Test
    void shouldAddOtherBallsEvenThoughGreenBallCountIsThree() {
        Bag bag = new Bag();
        for (int i = 0; i < 3; i++) {
            bag.add(Ball.GREEN);
        }

        assertTrue(bag.add(Ball.BLUE));
        assertFalse(bag.add(Ball.GREEN));
        assertTrue(bag.add(Ball.RED));
    }


    @Test
    void shouldNotAddRedBallMoreThanTwiceCountOfGreenBall() {
        Bag bag = new Bag();
        bag.add(Ball.GREEN);
        assertTrue(bag.add(Ball.RED));
        assertTrue(bag.add(Ball.RED));
        assertFalse(bag.add(Ball.RED));
    }


    @Test
    void shouldNotAddRedBallIfThereIsNoGreenBall() {
        Bag bag = new Bag();
        assertFalse(bag.add(Ball.RED));
        assertTrue(bag.add(Ball.BLUE));
    }


    @Test
    void shouldAddRedBallIfGreenBallAddedInBetween() {
        Bag bag = new Bag();
        assertFalse(bag.add(Ball.RED));
        assertTrue(bag.add(Ball.GREEN));
        assertTrue(bag.add(Ball.RED));
    }

    @Test
    void shouldNotAddYellowIfItReached40PercentOfTotalBalls() {
        Bag bag = new Bag();
        assertFalse(bag.add(Ball.RED));
        assertTrue(bag.add(Ball.GREEN));
        assertTrue(bag.add(Ball.RED));
        assertTrue(bag.add(Ball.YELLOW));
        assertTrue(bag.add(Ball.YELLOW));
        assertFalse(bag.add(Ball.YELLOW));
        assertTrue(bag.add(Ball.BLUE));
    }

    @Test
    void shouldGiveSummary() {
        Bag bag = new Bag();
        bag.add(Ball.GREEN);
        bag.add(Ball.RED);
        bag.add(Ball.BLUE);
        bag.add(Ball.BLUE);
        bag.add(Ball.YELLOW);
        assertEquals("Bag{balls={GREEN=1, RED=1, BLUE=2, YELLOW=1}, totalBallCount=5}", bag.toString());
    }
}
