package ex31;

import java.util.Scanner;
import java.util.InputMismatchException;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
public class App
{
    public static void main( String[] args )
    {
        int age;
        int restHR;
        Scanner scanner = new Scanner(System.in);


        while(true)
        {
            try
            {
                System.out.println("Enter age:");
                age = scanner.nextInt();
                break;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Sorry. That's not a valid input.");
                scanner.next();
            }
        }

        while(true)
        {
            try
            {
                System.out.println("Enter Resting Heart Rate:");
                restHR = scanner.nextInt();
                break;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Sorry. That's not a valid input.");
                scanner.next();
            }
        }
        scanner.close();

        printOutput(age, restHR);
    }

    static void printOutput(int age, int restHR)
    {
        System.out.printf("Resting Pulse: %d\tAge: %d\n", restHR, age);
        System.out.print("Intensity\t| Rate\n");
        System.out.print("----------------|--------\n");
        for(int i = 55; i <= 95; i += 5)
            System.out.printf("%d%%\t\t| %.0f bpm\n", i, calculateTargetHeartRate(age, restHR, i / 100.0));
    }

    static double calculateTargetHeartRate(int age, int restingHeartRate, double intensity)
    {
        return (((220.0 - age) - restingHeartRate) * intensity) + restingHeartRate;
    }
}