package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YearTest {


    @Test
    public void shouldBeLeapYearIfDivisibleBy400() {

        Year year = new Year(1600);
        boolean isLeapYear = year.isLeap();

        assertTrue(isLeapYear);
    }
    @Test
    public void shouldBeLeapIfDivisibleBy4And100And400(){

        Year year = new Year(400);
        boolean isLeapYear = year.isLeap();

        assertTrue(isLeapYear);
    }

    @Test
    public void shouldBeLeapIfDivisibleBy4ButNotBy100And400(){

        Year year = new Year(4);
        boolean isLeapYear = year.isLeap();

        assertTrue(isLeapYear);
    }

    @Test
    public void shouldBeNotLeapIfDivisibleBy100AndNotBy400(){

        Year year = new Year(1900);
        boolean isLeapYear = year.isLeap();

        assertFalse(isLeapYear);
    }
    @Test
    public void shouldBeNotLeapIfNotDivisibleBy4And100And400(){

        Year year = new Year(2023);
        boolean isLeapYear = year.isLeap();

        assertFalse(isLeapYear);
    }
    @Test
    public void shouldBeNotLeapIfDivisibleBy100ButNotBy4(){

        Year year = new Year(3250);
        boolean isLeapYear = year.isLeap();

        assertFalse(isLeapYear);
    }
    @Test
    public void shouldBeNotLeapIfNotDivisibleBy400ButIsBy4And100(){

        Year year = new Year(100);
        boolean isLeapYear = year.isLeap();

        assertFalse(isLeapYear);
    }
}
