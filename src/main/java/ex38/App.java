package ex38;

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
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a list of numbers, separated by spaces:");
        input = scanner.nextLine();

        ArrayList<Integer> numbers = filterEven(input);

        if(numbers.size() > 0)
        {
            System.out.print("The even numbers are ");
            for(int i = 0; i < numbers.size(); i++)
                System.out.printf("%d ", numbers.get(i));
        }
    }

    public static ArrayList<Integer> filterEven(String input)
    {
        String[] inputSplit = input.split(" ");
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for(int i = 0; i < inputSplit.length; i++)
        {
            if(Integer.parseInt(inputSplit[i]) % 2 == 1)
                continue;
            numbers.add(Integer.parseInt(inputSplit[i]));
        }

        return numbers;
    }
}
