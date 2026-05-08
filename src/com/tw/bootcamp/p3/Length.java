package com.tw.bootcamp.p3;

public class Length {
    private final double value;
    private final LengthUnit lengthUnit;

    private Length(double value, LengthUnit lengthUnit) {
        this.value = value;
        this.lengthUnit = lengthUnit;
    }

    public static Length create(double value, LengthUnit lengthUnit) {
        if (value < 0) {
            throw new InvalidMeasurementException("invalid measurement");
        }
        return new Length(value, lengthUnit);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length that = (Length) o;
        return Math.abs(lengthUnit.covertToBase(value) - that.lengthUnit.covertToBase(that.value)) <= 0.0001;
    }

    public Length add(Length other) {
        return create(lengthUnit.covertToBase(value) + other.lengthUnit.covertToBase(other.value), LengthUnit.INCH);
    }
}
