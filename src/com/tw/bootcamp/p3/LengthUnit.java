package com.tw.bootcamp.p3;

public enum LengthUnit {
    FEET(12), INCH(1), CENTIMETER(0.4), MILLIMETER(0.04);

    private final double conversionFactor;

    LengthUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double covertToBase(double value) {
        return value * conversionFactor;
    }
}
