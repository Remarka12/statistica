package ru.netology.stats;

public class StatsService {
    public long totalSales(long[] sales) {
        long total = 0;
        for (long sale : sales) {
            total += sale;
        }
        return total;
    }

    public long averageSale(long[] sales) {
        return totalSales(sales) / sales.length;
    }

    public int monthMaxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int monthMinSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int amountMonthSalesBelowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSale(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int amountMonthSalesAboveAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageSale(sales)) {
                counter++;
            }
        }
        return counter;
    }

}