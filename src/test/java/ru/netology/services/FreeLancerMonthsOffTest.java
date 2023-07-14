package ru.netology.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FreeLancerMonthsOffTest {
    @Test
    public void testCalculate() {
        FreeLancerMonthsOff service = new FreeLancerMonthsOff();
        int income = 100000;
        int expenses = 50000;
        int threshold = 1000000;
        int expected = 0;
        int actual = service.calculate(income, expenses, threshold);
        assertEquals(expected, actual);
    }
}
