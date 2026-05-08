package com.tw.bootcamp.p3;

public class Measurement {
    private final double value;
    private final Unit unit;

    private Measurement(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Measurement create(double value, Unit unit) {
        if (value < 0) {
            throw new InvalidMeasurementException("invalid measurement");
        }
        return new Measurement(value, unit);
    }

    public boolean isEqual(Measurement other) {
        return this.value * unit.conversionFactor == other.value * other.unit.conversionFactor;
    }
}
