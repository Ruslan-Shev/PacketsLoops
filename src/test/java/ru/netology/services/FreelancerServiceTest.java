package ru.netology.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FreelancerServiceTest {
    @Test
    public void shouldCalculateVacationMonths() {
        FreelancerService service = new FreelancerService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;
        int actual = service.calculateVacationMonths(income, expenses, threshold);
        assertEquals(expected, actual);
    }
}
