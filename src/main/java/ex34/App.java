package ex34;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
public class App
{
    public static void main( String[] args )
    {
        String removeEmp;
        Scanner scanner = new Scanner(System.in);

        String[] employeeList = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        printEmployees(employeeList);

        System.out.println("\nEnter an employee name to remove:");
        removeEmp = scanner.nextLine();
        scanner.close();
        System.out.print("\n");

        employeeList = removeEmployee(employeeList, removeEmp); // May need to return full array

        printEmployees(employeeList);
    }

    public static void printEmployees(String[] employeeList)
    {
        System.out.printf("There are %d employees:%n", employeeList.length);
        for(int i = 0; i < employeeList.length; i++)
            System.out.println(employeeList[i]);
    }

    public static String[] removeEmployee(String[] employeeList, String employee)
    {
        int j = 0;
        String[] newEmpList = new String[employeeList.length - 1];

        for(int i = 0; i < employeeList.length; i++)
        {
            if(employeeList[i].equalsIgnoreCase(employee))
                continue;

            newEmpList[j++] = employeeList[i];
        }

        return newEmpList;
    }
}