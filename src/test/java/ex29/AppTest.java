package ex29;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
public class AppTest
{
    @Test
    public void isAccurate()
    {
        assertEquals(18, (int)App.calculateRule(4));
        assertEquals(24, (int)App.calculateRule(3));
        assertEquals(36, (int)App.calculateRule(2));
    }
}