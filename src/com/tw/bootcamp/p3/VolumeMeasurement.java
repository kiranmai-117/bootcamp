package com.tw.bootcamp.p3;

public class VolumeMeasurement {
    private final double value;
    private final VolumeUnit volumeUnit;

    private VolumeMeasurement(double value, VolumeUnit volumeUnit) {
        this.value = value;
        this.volumeUnit = volumeUnit;
    }

    public static VolumeMeasurement create(double value, VolumeUnit volumeUnit) {
        if (value < 0) {
            throw new InvalidMeasurementException("invalid measurement");
        }
        return new VolumeMeasurement(value, volumeUnit);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        VolumeMeasurement that = (VolumeMeasurement) o;
        return Double.compare(value * volumeUnit.conversionFactor, that.value * that.volumeUnit.conversionFactor) == 0;
    }
}

