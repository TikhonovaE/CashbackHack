package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemainBelowBoundary() {
        int expected = 1;
        int actual = service.remain(999);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainForBoundary() {
        int expected = 0;
        int actual = service.remain(2000);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainAboveBoundary() {
        int expected = 999;
        int actual = service.remain(1001);
        assertEquals(expected, actual);
    }

}
