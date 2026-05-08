package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CompareTest {
    @Test
    void shouldCompareLengthInFeetAndInchesAndReturnTrue() {
        Compare compare = new Compare();
        boolean isEqual = compare.isEqual(1, 12);
        assertTrue(isEqual);
    }

    @Test
    void shouldCompareLengthInFeetAndInchesAndReturnFalse() {
        Compare compare = new Compare();
        boolean isEqual = compare.isEqual(1, 15);
        assertFalse(isEqual);
    }
}