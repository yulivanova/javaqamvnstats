package ru.netology.stats;

public class StatsService {

    public int salesAmount(int[] sales) { // Сумму всех продаж
        int amount = 0;
        for (long sale : sales) {
            amount += sale;
        }
        return amount;
    }

    public int averageSalesAmount(int[] sales) { // Средняя сумма продаж в месяц
        return salesAmount(sales) / sales.length;
    }

    public int maxSales(int[] sales) { // Последний номер месяца, в котором был пик продаж
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

    public int minSales(long[] sales) { // Последний номер месяца, в котором был минимум продаж
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

    public int belowAverage(int[] sales) { // Кол-во месяцев, в которых продажи были ниже среднего
        int estimation = 0;
        long averageSalesAmount = averageSalesAmount(sales);
        for (long sale : sales) {
            if (sale > averageSalesAmount) {
                estimation++;
            }
        }
        return estimation;
    }

    public int aboveAverage(int[] sales) { // Кол-во месяцев, в которых продажи были выше среднего
        int estimation = 0;
        long averageSalesAmount = averageSalesAmount(sales);
        for (long sale : sales) {
            if (sale < averageSalesAmount) {
                estimation++;
            }
        }
        return estimation;
    }
}



