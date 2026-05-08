package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CompareTest {
    @Test
    void shouldCompareLengthInFeetAndInchesAndReturnTrue() {
        Compare compare = new Compare();
        Unit inch = Unit.INCH.setValue(12);
        Unit feet = Unit.FEET.setValue(1);
        boolean isEqual = compare.isEqual(feet, inch);
        assertTrue(isEqual);
    }

    @Test
    void shouldCompareLengthInFeetAndInchesAndReturnFalse() {
        Compare compare = new Compare();
        Unit inch = Unit.INCH.setValue(15);
        Unit feet = Unit.FEET.setValue(1);
        boolean isEqual = compare.isEqual(inch, feet);
        assertFalse(isEqual);
    }

    @Test
    void shouldCompareLengthInInchAndCentimeterAndReturnTrue() {
        Compare compare = new Compare();
        Unit inch = Unit.INCH.setValue(2);
        Unit centimeter = Unit.CENTIMETER.setValue(5);
        boolean isEqual = compare.isEqual(inch, centimeter);
        assertTrue(isEqual);
    }

    @Test
    void shouldCompareLengthInInchAndCentimeterAndReturnFalse() {
        Compare compare = new Compare();
        Unit inch = Unit.INCH.setValue(2);
        Unit centimeter = Unit.CENTIMETER.setValue(6);
        boolean isEqual = compare.isEqual(inch, centimeter);
        assertFalse(isEqual);
    }


}