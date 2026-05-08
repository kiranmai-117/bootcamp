package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureTest {
    @Test
    void shouldCompareTemperatureInFahrenheitAndCelsiusAndReturnTrue() {
        Temperature t1 = Temperature.create(212, TemperatureUnit.FAHRENHEIT);
        Temperature t2 = Temperature.create(100, TemperatureUnit.CELSIUS);
        assertEquals(t1, t2);
    }
}
