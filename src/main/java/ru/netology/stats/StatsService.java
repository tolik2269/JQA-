package ru.netology.stats;

import java.util.stream.IntStream;

public class StatsService {

    public int summSale(int[] sale) {
        int total = IntStream.of(sale).sum();
        return total;
    }

    public int averageSale(int[] sale) {
        int total = IntStream.of(sale).sum() / 12;
        return total;
    }

    public int maxSales(int[] sale) {
        int maxMonth = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] >= sale[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sale) {
        int minMonth = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] <= sale[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int minAverageSale(int[] sale) {
        int averege = 15;
        int summ = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] < averege) {
                summ++;
            }
        }
        return summ;
    }

    public int maxAverageSale(int[] sale) {
        int averege = 15;
        int summ = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] > averege) {
                summ++;
            }
        }
        return summ;
    }
}