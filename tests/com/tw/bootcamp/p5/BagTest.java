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
            bag.add(Ball.GREEN);
        }
        assertFalse(bag.add(Ball.GREEN));
    }
}
