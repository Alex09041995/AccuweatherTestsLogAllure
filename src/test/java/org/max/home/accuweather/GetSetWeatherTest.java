package org.max.home.accuweather;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.max.home.accuweather.weather.DailyForecast;
import org.max.home.accuweather.weather.Headline;
import org.max.home.accuweather.weather.Weather;

import java.io.IOException;
import java.util.List;

public class GetSetWeatherTest extends AccuweatherAbstractTest {

    @Test
    public void testSerializationAndDeserialization() throws IOException {
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
