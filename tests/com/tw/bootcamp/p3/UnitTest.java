package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTest {

    @Test
    void shouldReturnConversionFactorForFeet() {
        assertEquals(30, Unit.FEET.conversionFactor);
    }

    @Test
    void shouldReturnConversionFactorForCentimeter() {
        assertEquals(1, Unit.CENTIMETER.conversionFactor);
    }

    @Test
    void shouldReturnConversionFactorForInch() {
        assertEquals(2.5, Unit.INCH.conversionFactor);
    }
}
