package com.tw.bootcamp.p3;

public class Temperature {
    private final double value;
    private final TemperatureUnit temperatureUnit;

    private Temperature(double value, TemperatureUnit temperatureUnit) {
        this.value = value;
        this.temperatureUnit = temperatureUnit;
    }

    public static Temperature create(double value, TemperatureUnit temperatureUnit) {
        if (value < 0) {
            throw new InvalidMeasurementException("invalid measurement");
        }
        return new Temperature(value, temperatureUnit);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Temperature that = (Temperature) o;
        return Math.abs(temperatureUnit.covertToBase(value) - that.temperatureUnit.covertToBase(that.value)) <= 0.0001;
    }

    public Temperature add(Temperature other) {
        return create(temperatureUnit.covertToBase(value) + other.temperatureUnit.covertToBase(other.value), TemperatureUnit.CELSIUS);
    }
}
