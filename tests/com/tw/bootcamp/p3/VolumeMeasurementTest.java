package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VolumeMeasurementTest {

    @Test
    void shouldCompareVolumeGallonAndLiterAndReturnTrue() {
        VolumeMeasurement m1 = VolumeMeasurement.create(1, VolumeUnit.GALLON);
        VolumeMeasurement m2 = VolumeMeasurement.create(3.78, VolumeUnit.LITER);
        assertEquals(m2, m1);
    }

    @Test
    void shouldCompareVolumeGallonAndLiterAndReturnFalse() {
        VolumeMeasurement m1 = VolumeMeasurement.create(1, VolumeUnit.GALLON);
        VolumeMeasurement m2 = VolumeMeasurement.create(4.89, VolumeUnit.LITER);
        assertNotEquals(m2, m1);
    }

    @Test
    void shouldThrowErrorForInvalidMeasurement() {
        assertThrows(InvalidMeasurementException.class, () -> VolumeMeasurement.create(-12, VolumeUnit.GALLON));
    }
}
