package ru.netology.stats;

public class StatsService {

    // Подсчет суммы продаж
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    // Подсчет средней суммы продаж
    public int calculateAverage(int[] sales) {
        int average = calculateSum(sales) / sales.length;
        return average;
    }

    // Номер месяца, в котором был пик продаж
    public int findMaxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    // Номер месяца, в котором был минимум продаж
    public int findMinSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // Количество месяцев, в которых продажи были ниже средней
    public int belowAverage(int[] sales) {
        int average = calculateAverage(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                count++;
            }
        }
        return count;
    }

    // Количество месяцев, в которых продажи были выше средней
    public int aboveAverage(int[] sales) {
        long average = calculateAverage(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                count++;
            }
        }
        return count;
    }
}
