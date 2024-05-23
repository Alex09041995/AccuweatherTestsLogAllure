package org.max.home.accuweather;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.max.home.accuweather.location.Region;

public class GetRegionTest extends AccuweatherAbstractTest {
    private Region region;

    @BeforeEach
    public void setUp() {
        region = new Region();
    }

    @Test
    public void checkSet_GetId() {
        String expectedId = "";
        region.setId(expectedId);
        Assertions.assertEquals(expectedId, region.getId());
    }

    @Test
    public void checkSet_GetLocalizedName() {
        String expectedLocalizedName = "LocalizedName";
        region.setLocalizedName(expectedLocalizedName);
        Assertions.assertEquals(expectedLocalizedName, region.getLocalizedName());
    }

    @Test
    public void checkSet_GetEnglishName() {
        String expectedEnglishName = "EnglishName";
        region.setEnglishName(expectedEnglishName);
        Assertions.assertEquals(expectedEnglishName, region.getEnglishName());
    }
}
