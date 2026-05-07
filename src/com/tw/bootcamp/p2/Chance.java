package com.tw.bootcamp.p2;

import java.util.Objects;

public class Chance {
    private final double value;

    private Chance(double value) {
        this.value = value;
    }

    public static Chance create(double value) {
        if (value < 0 || value > 1) {
            throw new IllegalArgumentException("Invalid Chance value");
        }
        return new Chance(value);
    }

    public Chance complement() {
        return create(1 - value);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Chance chance = (Chance) o;
        return Double.compare(value, chance.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    public Chance and(Chance other) {
        double newValue = this.value * other.value;
        return create(newValue);
    }

    public Chance or(Chance other) {
        double newValue = this.value + other.value - this.value * other.value;
        return create(newValue);
    }
}
