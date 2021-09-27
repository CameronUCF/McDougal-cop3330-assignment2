package ex36;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.ArrayList;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
public class AppTest
{
    @Test
    public void isAccurate()
    {
        ArrayList<Double> numbers = new ArrayList<Double>();
        numbers.add(100.0);
        numbers.add(200.0);
        numbers.add(1000.0);
        numbers.add(300.0);

        assertEquals(400.0, App.average(numbers), 0);
        assertEquals(100.0, App.min(numbers), 0);
        assertEquals(1000.0, App.max(numbers), 0);
        assertEquals(353.55, App.std(numbers), 0.005);
    }
}