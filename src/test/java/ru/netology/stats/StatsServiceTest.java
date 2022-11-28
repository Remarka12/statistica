package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void totalSalesOfYear() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.totalSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findAverageSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averageSale(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMaxMonthSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonth = 8;
        long actualMonth = service.monthMaxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    public void findMinMonthSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonth = 9;
        long actualMonth = service.monthMinSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void findAmountMonthBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.amountMonthSalesBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findAmountMonthAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.amountMonthSalesAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

}