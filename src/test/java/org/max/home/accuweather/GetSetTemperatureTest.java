package org.max.home.accuweather;

import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.max.home.accuweather.weather.Maximum;
import org.max.home.accuweather.weather.Minimum;
import org.max.home.accuweather.weather.Temperature;


@Epic(value = "Тестирование API https://developer.accuweather.com/apis")
@Feature(value = "Домашнее задание")
public class GetSetTemperatureTest extends AccuweatherAbstractTest {
    private Temperature temperature;

    @BeforeEach
    public void setUp() {
        temperature = new Temperature();
    }

    @Test
    @DisplayName("GetSetTemperatureTest")
    @Description("GET Temperature")
    @Link("")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Шмыгарев Александр")
    @Story(value = "Тестирование метода checkGetMaximum")
    public void checkGetMaximum() {
        Maximum expectedMaximum = new Maximum();
        temperature.setMaximum(expectedMaximum);
        Maximum actualMaximum = temperature.getMaximum();
        Assertions.assertEquals(expectedMaximum, actualMaximum);
    }

    @Test
    @DisplayName("GetSetTemperatureTest")
    @Description("GET Temperature")
    @Link("")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Шмыгарев Александр")
    @Story(value = "Тестирование метода checkSetMaximum")
    public void checkSetMaximum() {
        Maximum newMaximum = new Maximum();
        temperature.setMaximum(newMaximum);
        Assertions.assertEquals(newMaximum, temperature.getMaximum());
    }

    @Test
    @DisplayName("GetSetTemperatureTest")
    @Description("GET Temperature")
    @Link("")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Шмыгарев Александр")
    @Story(value = "Тестирование метода checkGetMinimum")
    public void checkGetMinimum() {
        Minimum expectedMinimum = new Minimum();
        temperature.setMinimum(expectedMinimum);
        Minimum actualMinimum = temperature.getMinimum();
        Assertions.assertEquals(expectedMinimum, actualMinimum);
    }

    @Test
    @DisplayName("GetSetTemperatureTest")
    @Description("GET Temperature")
    @Link("")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Шмыгарев Александр")
    @Story(value = "Тестирование метода checkSetMinimum")
    public void checkSetMinimum() {
        Minimum newMinimum = new Minimum();
        temperature.setMinimum(newMinimum);
        Assertions.assertEquals(newMinimum, temperature.getMinimum());
    }
}
