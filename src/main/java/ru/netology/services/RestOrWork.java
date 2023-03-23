package ru.netology.services;

public class RestOrWork {

    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int counter = 0;

        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) {
                money = (money - expenses) / 3;
                counter++;
            } else {
                money = money + income - expenses;
            }
        }
        return counter;
    }
}