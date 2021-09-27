package ex24;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron McDougal
 */
public class AppTest
{
    @Test
    public void isAnagram()
    {
        assertEquals(true, App.isAnagram("note", "tone"));
        assertEquals(true, App.isAnagram("NoTe", "tOnE"));
    }

    @Test
    public void notAnagram()
    {
        assertEquals(false, App.isAnagram("No", "Match"));
    }
}
