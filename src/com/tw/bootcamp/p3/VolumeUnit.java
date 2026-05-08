package com.tw.bootcamp.p3;

public enum VolumeUnit {
    GALLON(3.78), LITER(1);

    public final double conversionFactor;

    VolumeUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

}
