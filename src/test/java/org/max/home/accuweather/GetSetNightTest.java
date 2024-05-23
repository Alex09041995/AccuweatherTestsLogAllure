package org.max.home.accuweather;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.max.home.accuweather.weather.Night;


@Epic(value = "Тестирование API https://developer.accuweather.com/apis")
@Feature(value = "Домашнее задание")
public class GetSetNightTest extends AccuweatherAbstractTest {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    @DisplayName("GetSetNightTest")
    @Description("GET NightPrecipitation")
    @Link("https://developer.accuweather.com/apis")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Шмыгарев Александр")
    @Story(value = "Тестирование метода checkGet_SetNight")
    void checkGet_SetNight() throws Exception {
        Night night = new Night();
        night.setIcon(10);
        night.setIconPhrase("");
        night.setHasPrecipitation(true);
        String json = objectMapper.writeValueAsString(night);
        Night deserializedNight = objectMapper.readValue(json, Night.class);
        Assertions.assertEquals(night.getIcon(), deserializedNight.getIcon());
        Assertions.assertEquals(night.getIconPhrase(), deserializedNight.getIconPhrase());
        Assertions.assertEquals(night.getHasPrecipitation(), deserializedNight.getHasPrecipitation());
    }
}
