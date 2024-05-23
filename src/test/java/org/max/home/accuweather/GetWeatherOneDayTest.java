package org.max.home.accuweather;

import io.qameta.allure.*;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.max.home.accuweather.weather.Weather;

import static io.restassured.RestAssured.given;

@Epic(value = "Тестирование API https://developer.accuweather.com/apis")
@Feature(value = "Домашнее задание")
public class GetWeatherOneDayTest extends AccuweatherAbstractTest {

    @Test
    @DisplayName("GetWeatherOneDayTest")
    @Description("GET WeatherOneDay")
    @Link("")
    @Severity(SeverityLevel.MINOR)
    @Owner("Шмыгарев Александр")
    @Story(value = "Тестирование метода getWeatherOneDay_shouldReturn")
    void getWeatherOneDay_shouldReturn() {

        Weather response = given()
                .queryParam("apikey", getApiKey())
                .when()
                .get(getBaseUrl()+"/forecasts/v1/daily/1day/294021")
                .then()
                .statusCode(200)
                .time(Matchers.lessThan(3000L))
                .extract()
                .response()
                .body().as(Weather.class);

        Assertions.assertEquals(1,response.getDailyForecasts().size());
    }
}
