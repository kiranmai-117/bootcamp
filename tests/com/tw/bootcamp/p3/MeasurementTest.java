package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {
    @Test
    void shouldCompareLengthInFeetAndInchesAndReturnTrue() {
        Measurement m1 = Measurement.create(12, Unit.INCH);
        Measurement m2 = Measurement.create(1, Unit.FEET);
        boolean isEqual = m2.isEqual(m1);
        assertTrue(isEqual);
    }

    @Test
    void shouldCompareLengthInFeetAndInchesAndReturnFalse() {
        Measurement m1 = Measurement.create(13, Unit.INCH);
        Measurement m2 = Measurement.create(1, Unit.FEET);
        boolean isEqual = m2.isEqual(m1);
        assertFalse(isEqual);
    }

    @Test
    void shouldCompareLengthInInchAndCentimeterAndReturnTrue() {
        Measurement m1 = Measurement.create(2, Unit.INCH);
        Measurement m2 = Measurement.create(5, Unit.CENTIMETER);
        boolean isEqual = m1.isEqual(m2);
        assertTrue(isEqual);
    }

    @Test
    void shouldCompareLengthInCentimeterAndInchAndReturnTrue() {
        Measurement m1 = Measurement.create(2, Unit.INCH);
        Measurement m2 = Measurement.create(5, Unit.CENTIMETER);
        boolean isEqual = m2.isEqual(m1);
        assertTrue(isEqual);
    }

    @Test
    void shouldCompareLengthInInchAndCentimeterAndReturnFalse() {
        Measurement m1 = Measurement.create(2, Unit.INCH);
        Measurement m2 = Measurement.create(6, Unit.CENTIMETER);
        boolean isEqual = m2.isEqual(m1);
        assertFalse(isEqual);
    }

    @Test
    void shouldCompareLengthInCMAndMMAndReturnTrue() {
        Measurement m1 = Measurement.create(1, Unit.CENTIMETER);
        Measurement m2 = Measurement.create(10, Unit.MILLIMETER);
        boolean isEqual = m2.isEqual(m1);
        assertTrue(isEqual);
    }

    @Test
    void shouldCompareLengthInCMAndMMAndReturnFalse() {
        Measurement m1 = Measurement.create(1, Unit.CENTIMETER);
        Measurement m2 = Measurement.create(6, Unit.MILLIMETER);
        boolean isEqual = m2.isEqual(m1);
        assertFalse(isEqual);
    }

    @Test
    void shouldThrowErrorForInvalidMeasurement() {
        assertThrows(InvalidMeasurementException.class, () -> Measurement.create(-12, Unit.INCH));
    }
}