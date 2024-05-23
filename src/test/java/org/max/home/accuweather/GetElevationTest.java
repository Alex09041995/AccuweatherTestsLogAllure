package org.max.home.accuweather;


import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.max.home.accuweather.location.Elevation;
import org.max.home.accuweather.location.Imperial;
import org.max.home.accuweather.location.Metric;

@Epic(value = "Тестирование API https://developer.accuweather.com/apis")
@Feature(value = "Домашнее задание")
public class GetElevationTest extends AccuweatherAbstractTest {

    @Test
    @DisplayName("GetElevationTest")
    @Description("GET Elevation")
    @Link("")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Шмыгарев Александр")
    @Story(value = "Тестирование метода - checkGetMetric_Imperial")
    public void checkGetMetric_Imperial() {
        Elevation elevation = new Elevation();
        Metric metric = new Metric();
        Imperial imperial = new Imperial();
        elevation.setMetric(metric);
        elevation.setImperial(imperial);
        Assertions.assertEquals(metric, elevation.getMetric());
        Assertions.assertEquals(imperial, elevation.getImperial());
    }
}

