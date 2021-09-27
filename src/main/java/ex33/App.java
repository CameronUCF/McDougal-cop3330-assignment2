package ex33;

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
        String answer;
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your question?\n> ");
        scanner.nextLine();
        scanner.close();

        answer = answer();

        System.out.printf("%s.", answer);
    }

    public static String answer()
    {
        Random rand = new Random();
        int index = rand.nextInt(4);
        String[] answers = {"Yes", "No", "Maybe", "Ask again later"};



        return answers[index];
    }
}
