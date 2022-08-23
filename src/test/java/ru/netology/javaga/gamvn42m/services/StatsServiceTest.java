package ru.netology.javaga.gamvn42m.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

    public void shouldSum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsServices service = new StatsServices();

        long actual = service.sum(sales);
        long expekted = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(expekted, actual);
    }


    @Test
    public void shouldAvgSum() {
        long[] sum = {8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18};
        StatsServices service = new StatsServices();
        long aktual = service.avg(sum);
        long expekted = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        Assertions.assertEquals(expekted, aktual);


    }

    @Test
    public void shouldMinSalesMinMonth() {
        long[] minMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsServices services = new StatsServices();
        int aktual = services.minSales(minMonth);
        int expekted = 9;
        Assertions.assertEquals(expekted, aktual);

    }

    @Test

    public void shouldMaxSalesMaxMonth() {
        long[] maxMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsServices services = new StatsServices();
        int aktual = services.maxSales(maxMonth);
        int expekted = 8;
        Assertions.assertEquals(expekted, aktual);


    }

    @Test

    public void shouldCountMonthAboveAvg() {
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsServices services = new StatsServices();
        long aktual = services.avg(month);
        int expekted = 15;
        Assertions.assertEquals(expekted, aktual);
    }

    @Test

    public void shouldCountBelowAvg() {
        long[] below = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsServices services = new StatsServices();
        long aktual = services.avg(below);
        long expekted = 15;
        Assertions.assertEquals(expekted, aktual);

    }

}
