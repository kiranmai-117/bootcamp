package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VolumeUnitTest {
    @Test
    void shouldReturnConversionFactorForGallon() {
        assertEquals(3.78, VolumeUnit.GALLON.conversionFactor);
    }

    @Test
    void shouldReturnConversionFactorForLiter() {
        assertEquals(1, VolumeUnit.LITER.conversionFactor);
    }
}
