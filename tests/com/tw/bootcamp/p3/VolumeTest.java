package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VolumeTest {

    @Test
    void shouldCompareVolumeGallonAndLiterAndReturnTrue() {
        Volume m1 = Volume.create(1, VolumeUnit.GALLON);
        Volume m2 = Volume.create(3.78, VolumeUnit.LITER);
        assertEquals(m2, m1);
    }

    @Test
    void shouldCompareVolumeGallonAndLiterAndReturnFalse() {
        Volume m1 = Volume.create(1, VolumeUnit.GALLON);
        Volume m2 = Volume.create(4.89, VolumeUnit.LITER);
        assertNotEquals(m2, m1);
    }

    @Test
    void shouldAddTwoVolumesOfDifferentUnitAndReturnInLiter() {
        Volume m1 = Volume.create(1, VolumeUnit.LITER);
        Volume m2 = Volume.create(1, VolumeUnit.GALLON);
        assertEquals(Volume.create(4.78, VolumeUnit.LITER), m1.add(m2));
    }

    @Test
    void shouldThrowErrorForInvalidMeasurement() {
        assertThrows(InvalidMeasurementException.class, () -> Volume.create(-12, VolumeUnit.GALLON));
    }
}
