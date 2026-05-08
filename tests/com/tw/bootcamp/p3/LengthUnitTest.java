package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthUnitTest {

    @Test
    void shouldReturnBaseConvertedValueForFeet() {
        assertEquals(12, LengthUnit.FEET.covertToBase(1));
    }

    @Test
    void shouldReturnBaseConvertedValueForCentimeter() {
        assertEquals(0.4, LengthUnit.CENTIMETER.covertToBase(1));
    }

    @Test
    void shouldReturnBaseConvertedValueForMillimeter() {
        assertEquals(0.04, LengthUnit.MILLIMETER.covertToBase(1));
    }

    @Test
    void shouldReturnBaseConvertedValueForInch() {
        assertEquals(1, LengthUnit.INCH.covertToBase(1));
    }

}
