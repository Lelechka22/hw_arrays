package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void shouldCalculateSum() {
        StatsService service = new StatsService();

        int actual = service.calculateSum(sales);
        int expected = 180;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAverage() {
        StatsService service = new StatsService();

        int actual = service.calculateAverage(sales);
        int expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();

        int actual = service.findMaxSales(sales);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();

        int actual = service.findMinSales(sales);
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBelowAverage() {
        StatsService service = new StatsService();

        int actual = service.belowAverage(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAboveAverage() {
        StatsService service = new StatsService();

        int actual = service.aboveAverage(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}
