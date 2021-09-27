package ex36;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
public class App
{
    public static void main( String[] args )
    {
        String input;
        ArrayList<Double> numbers = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter a number:");
            input = scanner.nextLine();
            if(input.equalsIgnoreCase("done"))
                break;

            numbers.add(Double.parseDouble(input));
        }

        printNumbers(numbers);

        System.out.printf("The average is %.1f\n", average(numbers));
        System.out.printf("The minimum is %.1f\n", min(numbers));
        System.out.printf("The maximum is %.1f\n", max(numbers));
        System.out.printf("The standard deviation is %.2f", std(numbers));

    }

    public static void printNumbers(ArrayList<Double> numbers)
    {
        System.out.print("Numbers: ");
        for(int i = 0; i < numbers.size(); i++)
        {
            if(i == numbers.size() - 1)
            {
                System.out.printf("%s\n", numbers.get(i));
                break;
            }

            System.out.printf("%s, ", numbers.get(i));
        }
    }

    public static double average(ArrayList<Double> numbers)
    {
        double total = 0;

        for(int i = 0; i < numbers.size(); i++)
            total += numbers.get(i);

        return total / numbers.size();
    }

    public static double max(ArrayList<Double> numbers)
    {
        double currentMax = 0;

        for(int i = 0; i < numbers.size(); i++)
            if(currentMax < numbers.get(i))
                currentMax = numbers.get(i);

        return currentMax;
    }

    public static double min(ArrayList<Double> numbers)
    {
        double currentMin = Double.MAX_VALUE;

        for(int i = 0; i < numbers.size(); i++)
            if(currentMin > numbers.get(i))
                currentMin = numbers.get(i);

        return currentMin;
    }

    public static double std(ArrayList<Double> numbers)
    {
        double mean = mean(numbers);
        double sum = 0;

        for(int i = 0; i < numbers.size(); i++)
        {
            sum += Math.pow(numbers.get(i) - mean, 2);
        }

        return Math.sqrt(sum/numbers.size());
    }

    public static double mean(ArrayList<Double> numbers)
    {
        double sum = 0;
        for(int i = 0; i < numbers.size(); i++)
            sum += numbers.get(i);

        return sum / numbers.size();
    }
}