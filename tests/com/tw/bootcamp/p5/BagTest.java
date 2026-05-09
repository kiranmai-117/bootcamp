package com.tw.bootcamp.p5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
}
