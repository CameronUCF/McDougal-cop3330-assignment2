package ex28;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron McDougal
 */
public class AppTest
{
    @Test
    public void isAccurate()
    {
        int[] numbers = {10, 20, 30, 40, 50};
        assertEquals(150, App.countTotal(numbers));

        int[] numbers2 = {15, 34, 28, 11, 64};
        assertEquals(152, App.countTotal(numbers2));
    }
}
