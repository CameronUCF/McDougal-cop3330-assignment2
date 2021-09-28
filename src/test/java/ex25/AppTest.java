package ex25;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron McDougal
 */
public class AppTest
{
    @Test
    public void isValid()
    {
        assertEquals(0, App.passwordValidator("123"));
        assertEquals(1, App.passwordValidator("abc"));
        assertEquals(2, App.passwordValidator("abedefgh123"));
        assertEquals(3, App.passwordValidator("123asdfasdf@!"));
    }
}
