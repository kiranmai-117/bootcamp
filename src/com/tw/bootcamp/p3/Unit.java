package com.tw.bootcamp.p3;

public enum Unit {
    FEET(30), INCH(2.5), CENTIMETER(1), MILLIMETER(0.1);

    public final double conversionFactor;

    Unit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }
}
