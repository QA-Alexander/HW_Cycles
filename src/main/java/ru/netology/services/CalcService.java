package ru.netology.services;

public class CalcService {
    public int calculate(int income, int expenses, int treshhold) {
        int count = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= treshhold) {
                money = money - expenses;
                money = money / 3;
                count++;
            } else {
                money = money + income;
                money = money - expenses;
            }
        }
        return count;
    }
}
