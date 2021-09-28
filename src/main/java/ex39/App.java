package ex39;

import java.util.Map;
import java.util.HashMap;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
public class App
{
    public static void main( String[] args )
    {
        Map<Integer, Emplyoee> empMap = createMap();

    }

    public static Map<Integer, Emplyoee> createMap()
    {
        Map<Integer, Emplyoee> empMap = new HashMap<>();

        Emplyoee emp = new Emplyoee("John", "Johnson", "Manager", "2016-12-31");
        empMap.put(0, emp);
        emp = new Emplyoee("Tou", "Xiong", "Software Engineer", "2016-10-05");
        empMap.put(1, emp);
        emp = new Emplyoee("Michaela", "Michaelson", "District Manager", "2015-12-19");
        empMap.put(2, emp);
        emp = new Emplyoee("Jake", "Jacobson", "Programmer", "");
        empMap.put(3, emp);
        emp = new Emplyoee("Jacquelyn", "Jackson", "DBA", "");
        empMap.put(4, emp);
        emp = new Emplyoee("Sally", "Webber", "Web Developer", "2015-12-18");
        empMap.put(5, emp);

        return empMap;
    }

    public static Map<Integer, Emplyoee> sortByValue(Map<Integer, Emplyoee> empMap)
    {
        Map<Integer, Emplyoee> newMap = new HashMap<>();

        for(int i = 0; i < empMap.size() - 1; i++)
        {
            for(int j = 0; j < empMap.size(); j++)
            {

            }
        }

        return newMap;
    }
}

class Emplyoee
{
    public String firstName;
    public String lastName;
    public String position;
    public String separationDate;

    public Emplyoee(String firstName, String lastName, String position, String separationDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.separationDate = separationDate;
    }
}