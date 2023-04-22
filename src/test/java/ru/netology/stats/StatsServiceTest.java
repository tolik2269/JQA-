package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

    @Test
    public void summTest() {
        StatsService statsService = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSumm = 180;
        int actualSumm = statsService.summSale(sale);
        Assertions.assertEquals(expectedSumm, actualSumm);
    }

    @Test
    public void averageTest() {
        StatsService statsService = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverage = 15;
        int actualSumm = statsService.averageSale(sale);
        Assertions.assertEquals(expectedAverage, actualSumm);
    }

    @Test
    public void maxSaleTest() {
        StatsService statsService = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 11, 19, 20, 7, 14, 14, 18};
        int expectedNax = 8;
        int actualSumm = statsService.maxSales(sale);
        Assertions.assertEquals(expectedNax, actualSumm);
    }

    @Test
    public void minSaleTest() {
        StatsService statsService = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 11, 19, 20, 7, 14, 14, 18};
        int expectedMin = 9;
        int actualSumm = statsService.minSales(sale);
        Assertions.assertEquals(expectedMin, actualSumm);
    }

    @Test
    public void minAverageSaleTest() {
        StatsService statsService = new StatsService();
        int[] sale = {18, 101, 131, 151, 18, 115, 19, 20, 7, 14, 14, 18};
        int expectedMinAverage = 3;
        int actualSumm = statsService.minAverageSale(sale);
        Assertions.assertEquals(expectedMinAverage, actualSumm);
    }

    @Test
    public void maxAverageSaleTest() {
        StatsService statsService = new StatsService();
        int[] sale = {18, 101, 131, 151, 18, 115, 19, 20, 7, 14, 14, 18};
        int expectedMaxAverage = 9;
        int actualSumm = statsService.maxAverageSale(sale);
        Assertions.assertEquals(expectedMaxAverage, actualSumm);
    }
}
