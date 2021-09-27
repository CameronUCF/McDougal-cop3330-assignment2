package ex27;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron McDougal
 */
public class AppTest
{
    @Test
    public void isTrue()
    {
        assertEquals(true, App.validateFirstName("Cameron"));
        assertEquals(true, App.validateLastName("McDougal"));
        assertEquals(true, App.validateZip("32119"));
        assertEquals(true, App.validateEmployeeID("CM-1337"));
    }

    @Test
    public void isFalse()
    {
        assertEquals(false, App.validateFirstName("C"));
        assertEquals(false, App.validateLastName("M"));
        assertEquals(false, App.validateZip("321"));
        assertEquals(false, App.validateEmployeeID("CJM-13370"));
    }
}
