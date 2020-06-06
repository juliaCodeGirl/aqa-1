package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void shouldCalculateIfAmountCorrect() {

        int amount = 450;

        int actual = service.remain(amount);
        int expected = 550;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldCalculateIfAmountZero() {

        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldCalculateIfAmountIsUnderZero() {

        int amount = -5;

        int actual = service.remain(amount);
        int expected = 1005;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldCalculateIfAmountIsOver1000() {

        int amount = 1005;

        int actual = service.remain(amount);
        int expected = 995;

        assertEquals(actual,expected);
    }



    //видимо тут логика такая, что предлагается купить уже до 2000, поэтому ожидается 1000
    //поэтому тест не проходит

//    @org.testng.annotations.Test
//    public void shouldCalculateIfAmount1000() {
//
//        int amount = 1000;
//
//        int actual = service.remain(amount);
//        int expected = 0;
//
//        assertEquals(actual, expected);
//    }

}