package org.max.home.accuweather;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.max.home.accuweather.weather.DailyForecast;
import org.max.home.accuweather.weather.Headline;
import org.max.home.accuweather.weather.Weather;

import java.io.IOException;
import java.util.List;


@Epic(value = "Тестирование API https://developer.accuweather.com/apis")
@Feature(value = "Домашнее задание")
public class GetSetWeatherTest extends AccuweatherAbstractTest {

    @Test
    @DisplayName("GetSetWeatherTest")
    @Description("GET Weather")
    @Link("")
    @Severity(SeverityLevel.MINOR)
    @Owner("Шмыгарев Александр")
    @Story(value = "Тестирование метода testGetSetWeather")
    public void testGetSetWeather() throws IOException {
        Weather weather = new Weather();
        weather.setHeadline(new Headline());
        DailyForecast dailyForecast = new DailyForecast();
        weather.setDailyForecasts(List.of(dailyForecast));
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(weather);
        Weather deserializedWeather = objectMapper.readValue(json, Weather.class);
        Assertions.assertNotNull(deserializedWeather.getHeadline());
        Assertions.assertNotNull(deserializedWeather.getDailyForecasts().get(0));
        Assertions.assertEquals(1, deserializedWeather.getDailyForecasts().size());
    }
}
