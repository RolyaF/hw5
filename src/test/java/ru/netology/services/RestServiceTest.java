package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RestServiceTest {

    @Test
    public void calculateTest1() {
        RestService service = new RestService();

        int actual = service.calculate(10000, 3000, 20000);
        int expected = 3;

        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void calculateTest2() {
        RestService service = new RestService();

        int actual = service.calculate(100000, 60000, 150000);
        int expected = 2;

        Assertions.assertEquals(actual, expected);
    }
}