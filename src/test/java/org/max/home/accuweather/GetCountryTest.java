package org.max.home.accuweather;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.max.home.accuweather.location.Country;


@Epic(value = "Тестирование API https://developer.accuweather.com/apis")
@Feature(value = "Домашнее задание")
public class GetCountryTest extends AccuweatherAbstractTest {

    @Test
    @DisplayName("GetCountryTest")
    @Description("GET Country")
    @Link("")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Шмыгарев Александр")
    @Story(value = "Тестирование метода - checkGetCountry")
    public void checkGetCountry() throws Exception {
        Country country = new Country();
        country.setId("RU");
        country.setLocalizedName("Российская Федерация");
        country.setEnglishName("Russian Federation");
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(country);
        Country deserializedCountry = objectMapper.readValue(json, Country.class);
        Assertions.assertEquals(country.getId(), deserializedCountry.getId());
        Assertions.assertEquals(country.getEnglishName(), deserializedCountry.getEnglishName());
        Assertions.assertEquals(country.getLocalizedName(), deserializedCountry.getLocalizedName());
    }
}
