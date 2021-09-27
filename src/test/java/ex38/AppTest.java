package ex38;

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
        ArrayList<Integer> numbers = App.filterEven("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20");
        for(int i = 0; i < numbers.size(); i++)
        {
            if(numbers.get(i) % 2 == 0)
                assert(true);
            else
                assert(false);
        }
    }
}