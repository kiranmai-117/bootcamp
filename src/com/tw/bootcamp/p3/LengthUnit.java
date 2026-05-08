package com.tw.bootcamp.p3;

public enum LengthUnit {
    FEET(30), INCH(2.5), CENTIMETER(1), MILLIMETER(0.1);

    public final double conversionFactor;

    LengthUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }
}
