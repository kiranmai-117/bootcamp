package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTest {

    @Test
    void shouldReturn12InchForOneFeet() {
        Unit inch = Unit.INCH;
        Unit feet = Unit.FEET;
        assertEquals(12, feet.getConversionFactor(inch));
    }
}
