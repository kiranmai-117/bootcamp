package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UnitTest {

    @Test
    void shouldReturnTrueForFeetToInchComparision() {
        Unit inch = Unit.INCH.setValue(12);
        Unit feet = Unit.FEET.setValue(1);
        assertTrue(feet.isEqual(inch));
    }
}
