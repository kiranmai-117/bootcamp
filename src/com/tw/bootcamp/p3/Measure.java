package com.tw.bootcamp.p3;

public class Measure {
    private final double value;
    private final Unit unit;

    public Measure(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean isEqual(Measure other) {
        return this.value * unit.getConversionFactor(other.unit) == other.value;
    }
}
