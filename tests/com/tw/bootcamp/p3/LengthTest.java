package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void shouldCompareLengthInFeetAndInchesAndReturnTrue() {
        Length m1 = Length.create(12, LengthUnit.INCH);
        Length m2 = Length.create(1, LengthUnit.FEET);
        assertEquals(m2, m1);
    }

    @Test
    void shouldCompareLengthInFeetAndInchesAndReturnFalse() {
        Length m1 = Length.create(13, LengthUnit.INCH);
        Length m2 = Length.create(1, LengthUnit.FEET);
        assertNotEquals(m2, m1);
    }

    @Test
    void shouldCompareLengthInInchAndCentimeterAndReturnTrue() {
        Length m1 = Length.create(2, LengthUnit.INCH);
        Length m2 = Length.create(5, LengthUnit.CENTIMETER);
        assertEquals(m1, m2);
    }

    @Test
    void shouldCompareLengthInCentimeterAndInchAndReturnTrue() {
        Length m1 = Length.create(2, LengthUnit.INCH);
        Length m2 = Length.create(5, LengthUnit.CENTIMETER);
        assertEquals(m2, m1);
    }

    @Test
    void shouldCompareLengthInInchAndCentimeterAndReturnFalse() {
        Length m1 = Length.create(2, LengthUnit.INCH);
        Length m2 = Length.create(6, LengthUnit.CENTIMETER);
        assertNotEquals(m2, m1);
    }

    @Test
    void shouldCompareLengthInCMAndMMAndReturnTrue() {
        Length m1 = Length.create(1, LengthUnit.CENTIMETER);
        Length m2 = Length.create(10, LengthUnit.MILLIMETER);
        assertEquals(m2, m1);
    }

    @Test
    void shouldCompareLengthInCMAndMMAndReturnFalse() {
        Length m1 = Length.create(1, LengthUnit.CENTIMETER);
        Length m2 = Length.create(6, LengthUnit.MILLIMETER);
        assertNotEquals(m2, m1);
    }

    @Test
    void shouldAddTwoLengthsOfSameUnit() {
        Length m1 = Length.create(5, LengthUnit.INCH);
        Length m2 = Length.create(5, LengthUnit.INCH);
        assertEquals(Length.create(10, LengthUnit.INCH), m1.add(m2));
    }

    @Test
    void shouldAddTwoLengthsOfDifferentUnitAndReturnInInches() {
        Length m1 = Length.create(2, LengthUnit.INCH);
        Length m2 = Length.create(2.5, LengthUnit.CENTIMETER);
        assertEquals(Length.create(3, LengthUnit.INCH), m1.add(m2));
    }

    @Test
    void shouldThrowErrorForInvalidMeasurement() {
        assertThrows(InvalidMeasurementException.class, () -> Length.create(-12, LengthUnit.INCH));
    }
}