package ex31;

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
        assertEquals(138, (int)App.calculateTargetHeartRate(22, 65, 0.55));
        assertEquals(151, (int)App.calculateTargetHeartRate(22, 65, 0.65));
        assertEquals(158, (int)App.calculateTargetHeartRate(22, 65, 0.70));

        assertEquals(135, (int)App.calculateTargetHeartRate(25, 75, 0.50));
        assertEquals(134, (int)App.calculateTargetHeartRate(25, 60, 0.55));
        assertEquals(145, (int)App.calculateTargetHeartRate(25, 70, 0.60));
    }
}