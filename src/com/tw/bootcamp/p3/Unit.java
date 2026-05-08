package com.tw.bootcamp.p3;

public enum Unit {
    FEET, INCH, CENTIMETER;

    public double getConversionFactor(Unit other) {
        if (other == INCH && this == FEET) {
            return 12;
        } else if (other == CENTIMETER && this == INCH) {
            return 2.5;
        }
        return 0;
    }

}
