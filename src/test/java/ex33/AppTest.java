package ex33;

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
        String test = App.answer();

        for(int i = 0; i < 10; i++)
        {
            if (test == "Yes")
                assertEquals("Yes", test);
            else if (test == "No")
                assertEquals("No", test);
            else if (test == "Maybe")
                assertEquals("Maybe", test);
            else if(test == "Ask again later")
                assertEquals("Ask again later", test);
            else
                assertEquals("Unexpected Output", test);
            test = App.answer();
        }
    }
}