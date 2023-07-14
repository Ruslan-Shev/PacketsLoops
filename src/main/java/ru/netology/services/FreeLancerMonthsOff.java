package ru.netology.services;

public class FreeLancerMonthsOff {
    public int calculate(int income, int expenses, int threshold) {
        int balance = 0;
        int monthsOff = 0;
        for (int i = 0; i <= 12; i++) {
            balance += income - expenses;
            if (balance >= threshold) {
                monthsOff++;
                balance -= threshold;
            }
            else {
                balance -= expenses * 3;
            }
        }
        return monthsOff;
    }
}
