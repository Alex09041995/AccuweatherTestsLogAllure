package org.max.home.accuweather;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.max.home.accuweather.location.Elevation;
import org.max.home.accuweather.location.Imperial;
import org.max.home.accuweather.location.Metric;


public class GetElevationTest extends AccuweatherAbstractTest {

    @Test
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

