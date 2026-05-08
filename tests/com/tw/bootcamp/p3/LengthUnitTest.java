package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthUnitTest {

    @Test
    void shouldReturnConversionFactorForFeet() {
        assertEquals(30, LengthUnit.FEET.conversionFactor);
    }

    @Test
    void shouldReturnConversionFactorForCentimeter() {
        assertEquals(1, LengthUnit.CENTIMETER.conversionFactor);
    }

    @Test
    void shouldReturnConversionFactorForInch() {
        assertEquals(2.5, LengthUnit.INCH.conversionFactor);
    }
}
