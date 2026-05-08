package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VolumeUnitTest {
    @Test
    void shouldReturnBaseConvertedValueForGallon() {
        assertEquals(3.78, VolumeUnit.GALLON.covertToBase(1));
    }

    @Test
    void shouldReturnBaseConvertedValueForLiter() {
        assertEquals(1, VolumeUnit.LITER.covertToBase(1));
    }
}
