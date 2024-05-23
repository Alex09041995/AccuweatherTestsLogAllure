package org.max.home.accuweather;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.max.home.accuweather.location.Country;


public class GetCountryTest extends AccuweatherAbstractTest {

    @Test
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
