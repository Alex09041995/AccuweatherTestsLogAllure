package org.max.home.accuweather;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.max.home.accuweather.weather.Maximum;
import org.max.home.accuweather.weather.Minimum;
import org.max.home.accuweather.weather.Temperature;


public class GetSetTemperatureTest extends AccuweatherAbstractTest {
    private Temperature temperature;

    @BeforeEach
    public void setUp() {
        temperature = new Temperature();
    }

    @Test
    public void checkGetMaximum() {
        Maximum expectedMaximum = new Maximum();
        temperature.setMaximum(expectedMaximum);
        Maximum actualMaximum = temperature.getMaximum();
        Assertions.assertEquals(expectedMaximum, actualMaximum);
    }

    @Test
    public void checkSetMaximum() {
        Maximum newMaximum = new Maximum();
        temperature.setMaximum(newMaximum);
        Assertions.assertEquals(newMaximum, temperature.getMaximum());
    }

    @Test
    public void checkGetMinimum() {
        Minimum expectedMinimum = new Minimum();
        temperature.setMinimum(expectedMinimum);
        Minimum actualMinimum = temperature.getMinimum();
        Assertions.assertEquals(expectedMinimum, actualMinimum);
    }

    @Test
    public void checkSetMinimum() {
        Minimum newMinimum = new Minimum();
        temperature.setMinimum(newMinimum);
        Assertions.assertEquals(newMinimum, temperature.getMinimum());
    }
}
