package ex34;

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
        String[] employeeList = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        String[] compareList = {"John Smith", "Jackie Jackson", "Amanda Cullen", "Jeremy Goodwin"};

        employeeList = App.removeEmployee(employeeList, "Chris Jones");

        for(int i = 0; i < 4; i++)
            assertEquals(compareList[i], employeeList[i]);
    }
}