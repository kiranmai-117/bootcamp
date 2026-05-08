package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthMeasurementTest {
    @Test
    void shouldCompareLengthInFeetAndInchesAndReturnTrue() {
        LengthMeasurement m1 = LengthMeasurement.create(12, LengthUnit.INCH);
        LengthMeasurement m2 = LengthMeasurement.create(1, LengthUnit.FEET);
        assertEquals(m2, m1);
    }

    @Test
    void shouldCompareLengthInFeetAndInchesAndReturnFalse() {
        LengthMeasurement m1 = LengthMeasurement.create(13, LengthUnit.INCH);
        LengthMeasurement m2 = LengthMeasurement.create(1, LengthUnit.FEET);
        assertNotEquals(m2, m1);
    }

    @Test
    void shouldCompareLengthInInchAndCentimeterAndReturnTrue() {
        LengthMeasurement m1 = LengthMeasurement.create(2, LengthUnit.INCH);
        LengthMeasurement m2 = LengthMeasurement.create(5, LengthUnit.CENTIMETER);
        assertEquals(m1, m2);
    }

    @Test
    void shouldCompareLengthInCentimeterAndInchAndReturnTrue() {
        LengthMeasurement m1 = LengthMeasurement.create(2, LengthUnit.INCH);
        LengthMeasurement m2 = LengthMeasurement.create(5, LengthUnit.CENTIMETER);
        assertEquals(m2, m1);
    }

    @Test
    void shouldCompareLengthInInchAndCentimeterAndReturnFalse() {
        LengthMeasurement m1 = LengthMeasurement.create(2, LengthUnit.INCH);
        LengthMeasurement m2 = LengthMeasurement.create(6, LengthUnit.CENTIMETER);
        assertNotEquals(m2, m1);
    }

    @Test
    void shouldCompareLengthInCMAndMMAndReturnTrue() {
        LengthMeasurement m1 = LengthMeasurement.create(1, LengthUnit.CENTIMETER);
        LengthMeasurement m2 = LengthMeasurement.create(10, LengthUnit.MILLIMETER);
        assertEquals(m2, m1);
    }

    @Test
    void shouldCompareLengthInCMAndMMAndReturnFalse() {
        LengthMeasurement m1 = LengthMeasurement.create(1, LengthUnit.CENTIMETER);
        LengthMeasurement m2 = LengthMeasurement.create(6, LengthUnit.MILLIMETER);
        assertNotEquals(m2, m1);
    }

    @Test
    void shouldAddTwoLengthsOfSameUnit() {
        LengthMeasurement m1 = LengthMeasurement.create(5, LengthUnit.INCH);
        LengthMeasurement m2 = LengthMeasurement.create(5, LengthUnit.INCH);
        assertEquals(LengthMeasurement.create(10, LengthUnit.INCH), m1.add(m2));
    }

    @Test
    void shouldAddTwoLengthsOfDifferentUnitAndReturnInInches() {
        LengthMeasurement m1 = LengthMeasurement.create(2, LengthUnit.INCH);
        LengthMeasurement m2 = LengthMeasurement.create(2.5, LengthUnit.CENTIMETER);
        assertEquals(LengthMeasurement.create(3, LengthUnit.INCH), m1.add(m2));
    }

    @Test
    void shouldThrowErrorForInvalidMeasurement() {
        assertThrows(InvalidMeasurementException.class, () -> LengthMeasurement.create(-12, LengthUnit.INCH));
    }
}