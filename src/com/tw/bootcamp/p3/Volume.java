package com.tw.bootcamp.p3;

public class Volume {
    private final double value;
    private final VolumeUnit volumeUnit;

    private Volume(double value, VolumeUnit volumeUnit) {
        this.value = value;
        this.volumeUnit = volumeUnit;
    }

    public static Volume create(double value, VolumeUnit volumeUnit) {
        if (value < 0) {
            throw new InvalidMeasurementException("invalid measurement");
        }
        return new Volume(value, volumeUnit);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Volume that = (Volume) o;
        return Math.abs(volumeUnit.covertToBase(value) - that.volumeUnit.covertToBase(that.value)) <= 0.0001;
    }

    public Volume add(Volume other) {
        return create(volumeUnit.covertToBase(value) + other.volumeUnit.covertToBase(other.value), VolumeUnit.LITER);
    }
}

