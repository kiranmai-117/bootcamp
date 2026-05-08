package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTest {

    @Test
    void shouldReturnConversionFactorForFeet() {
        Unit feet = Unit.FEET;
        assertEquals(30, feet.conversionFactor);
    }
}
