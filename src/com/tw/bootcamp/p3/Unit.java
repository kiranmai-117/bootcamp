package com.tw.bootcamp.p3;

public enum Unit {
    FEET, INCH, CENTIMETER;

    private double value;

    public Unit setValue(double value) {
        this.value = value;
        return this;
    }

    private double getConversionFactor(Unit other) {
        if (other == INCH && this == FEET) {
            return 12;
        } else if (other == CENTIMETER && this == INCH) {
            return 2.5;
        }
        return 0;
    }

    public boolean isEqual(Unit other) {
        return this.value * getConversionFactor(other) == other.value;
    }
}
