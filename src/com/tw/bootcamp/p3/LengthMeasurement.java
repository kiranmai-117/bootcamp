package com.tw.bootcamp.p3;

public class LengthMeasurement {
    private final double value;
    private final LengthUnit lengthUnit;

    private LengthMeasurement(double value, LengthUnit lengthUnit) {
        this.value = value;
        this.lengthUnit = lengthUnit;
    }

    public static LengthMeasurement create(double value, LengthUnit lengthUnit) {
        if (value < 0) {
            throw new InvalidMeasurementException("invalid measurement");
        }
        return new LengthMeasurement(value, lengthUnit);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LengthMeasurement that = (LengthMeasurement) o;
        return Double.compare(lengthUnit.covertToBase(value), that.lengthUnit.covertToBase(that.value)) == 0;
    }

    public LengthMeasurement add(LengthMeasurement other) {
        return create(lengthUnit.covertToBase(value) + other.lengthUnit.covertToBase(other.value), LengthUnit.INCH);
    }
}
