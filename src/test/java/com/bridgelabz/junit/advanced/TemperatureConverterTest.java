package com.bridgelabz.junit.advanced;

import com.junit.advanced.TemperatureConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {
    @Test
    void shouldConvertToFahrenheit(){
        Assertions.assertEquals(77, TemperatureConverter.celsiusToFahrenheit(25));
    }

    @Test
    void shouldConvertToCelsius(){
        Assertions.assertEquals(25, TemperatureConverter.fahrenheitToCelsius(77));
    }
}
