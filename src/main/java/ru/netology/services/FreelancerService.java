package ru.netology.services;

public class FreelancerService {
    public int calculateVacationMonths(int income, int expenses, int threshold) {
        int balance = 0;
        int vacationMonths = 0;
        for (int i = 1; i <= 12; i++) {
            if (balance < threshold) {
                balance += income - expenses;
            } else {
                vacationMonths++;
                balance -= expenses + balance / 3;
            }
        }
        return vacationMonths;
    }
}
