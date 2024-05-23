package org.max.home.accuweather;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.max.home.accuweather.weather.Night;

public class GetSetNightTest extends AccuweatherAbstractTest {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
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
