package org.max.home.accuweather;

import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.max.home.accuweather.location.Region;


@Epic(value = "Тестирование API https://developer.accuweather.com/apis")
@Feature(value = "Домашнее задание")
public class GetRegionTest extends AccuweatherAbstractTest {
    private Region region;

    @BeforeEach
    public void setUp() {
        region = new Region();
    }

    @Test
    @DisplayName("GetRegionTest")
    @Description("GET RegionId")
    @Link("")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Шмыгарев Александр")
    @Story(value = "Тестирование метода - checkSet_GetId")
    public void checkSet_GetId() {
        String expectedId = "";
        region.setId(expectedId);
        Assertions.assertEquals(expectedId, region.getId());
    }

    @Test
    @DisplayName("GetRegionTest")
    @Description("GET RegionLocalizedName")
    @Link("")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Шмыгарев Александр")
    @Story(value = "Тестирование метода - checkSet_GetLocalizedName")
    public void checkSet_GetLocalizedName() {
        String expectedLocalizedName = "LocalizedName";
        region.setLocalizedName(expectedLocalizedName);
        Assertions.assertEquals(expectedLocalizedName, region.getLocalizedName());
    }

    @Test
    @DisplayName("GetRegionTest")
    @Description("GET RegionEnglishName")
    @Link("")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Шмыгарев Александр")
    @Story(value = "Тестирование метода - checkSet_GetEnglishName")
    public void checkSet_GetEnglishName() {
        String expectedEnglishName = "EnglishName";
        region.setEnglishName(expectedEnglishName);
        Assertions.assertEquals(expectedEnglishName, region.getEnglishName());
    }
}
