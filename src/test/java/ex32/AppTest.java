package ex32;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
public class AppTest
{
    @Test
    public void testHigh()
    {
        assertEquals(false, App.testNumber(700, 500));
    }

    @Test
    public void testLow()
    {
        assertEquals(false, App.testNumber(200, 500));
    }

    @Test
    public void findValue()
    {
        assertEquals(true, App.testNumber(500, 500));
    }
}
