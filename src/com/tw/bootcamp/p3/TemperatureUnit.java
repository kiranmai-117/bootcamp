package com.tw.bootcamp.p3;

public enum TemperatureUnit {
    FAHRENHEIT, CELSIUS;

    public double covertToBase(double value) {
        if (this == FAHRENHEIT) {
            return 5 * (value - 32) / 9;
        }

        return value;
    }
}
