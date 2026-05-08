package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MeasureTest {
    @Test
    void shouldCompareLengthInFeetAndInchesAndReturnTrue() {
        Measure m1 = new Measure(12, Unit.INCH);
        Measure m2 = new Measure(1, Unit.FEET);
        boolean isEqual = m2.isEqual(m1);
        assertTrue(isEqual);
    }

    @Test
    void shouldCompareLengthInFeetAndInchesAndReturnFalse() {
        Measure m1 = new Measure(13, Unit.INCH);
        Measure m2 = new Measure(1, Unit.FEET);
        boolean isEqual = m2.isEqual(m1);
        assertFalse(isEqual);
    }

    @Test
    void shouldCompareLengthInInchAndCentimeterAndReturnTrue() {
        Measure m1 = new Measure(2, Unit.INCH);
        Measure m2 = new Measure(5, Unit.CENTIMETER);
        boolean isEqual = m1.isEqual(m2);
        assertTrue(isEqual);
    }

    @Test
    void shouldCompareLengthInInchAndCentimeterAndReturnFalse() {
        Measure m1 = new Measure(2, Unit.INCH);
        Measure m2 = new Measure(6, Unit.CENTIMETER);
        boolean isEqual = m2.isEqual(m1);
        assertFalse(isEqual);
    }
}