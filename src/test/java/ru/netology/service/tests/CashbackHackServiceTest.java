package ru.netology.service.tests;

import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldAdd400() {
        CashbackHackService service = new CashbackHackService();
        int amount = 600;

        int expected = 400;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldAdd999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;

        int expected = 999;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldAdd1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldAdd500() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;

        int expected = 500;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldNotAdd() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

}
