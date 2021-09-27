package ex35;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
public class App
{
    public static void main( String[] args )
    {
        String name;
        ArrayList<String> names = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter a name:");
            name = scanner.nextLine();
            if(name.equals(""))
                break;
            names.add(name);
        }

        String winner = pickRandomWinner(names);
        System.out.printf("The winner is... %s", winner);
    }

    public static String pickRandomWinner(ArrayList<String> names)
    {
        Random rand = new Random();
        return names.get(rand.nextInt(names.size()));
    }
}
