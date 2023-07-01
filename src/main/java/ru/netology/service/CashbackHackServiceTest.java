package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemainBelowBoundary() {
      int actual = service.remain(500);
      int expected = 500;
      assertEquals(actual,expected);
    }

    @Test
    public void testRemainForBoundary(){
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual,expected);
    }

    @Test
    public void testRemainAboveBoundary(){
        int actual = service.remain(1200);
        int expected = 800;
        assertEquals(actual,expected);
    }

}