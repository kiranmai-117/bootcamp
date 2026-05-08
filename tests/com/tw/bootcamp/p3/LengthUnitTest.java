package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthUnitTest {

    @Test
    void shouldReturnBaseConvertedValueForFeet() {
        assertEquals(30, LengthUnit.FEET.covertToBase(1));
    }

    @Test
    void shouldReturnBaseConvertedValueForCentimeter() {
        assertEquals(1, LengthUnit.CENTIMETER.covertToBase(1));
    }

    @Test
    void shouldReturnBaseConvertedValueForInch() {
        assertEquals(2.5, LengthUnit.INCH.covertToBase(1));
    }
}
