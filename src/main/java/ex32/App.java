package ex32;

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
        int guess;
        int guessCount = 0;
        char playAgain;
        boolean inGame = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lets play Guess the Number!");
        int answer = startGame(scanner);
        while(inGame)
        {
            guess = scanner.nextInt();
            guessCount++;

            if(testNumber(guess, answer))
            {
                System.out.printf("You got it in %d guesses!\n\nDo you wish to play again (Y/N)?\n", guessCount);
                // get next line and determine from there
                playAgain = scanner.next().charAt(0);
                if(Character.toLowerCase(playAgain) == 'n')
                    inGame = false;
                else if(Character.toLowerCase(playAgain) == 'y')
                {
                    answer = startGame(scanner);
                    guessCount = 0;
                }
            }

        }
        scanner.close();
    }

    public static int startGame(Scanner scanner)
    {
        int difficulty;
        int randomInt = 0;
        Random rand = new Random();

        System.out.println("Enter the difficulty level (1, 2, or 3):");
        difficulty = scanner.nextInt();

        if(difficulty == 1)
            randomInt = rand.nextInt((10 - 1) + 1) + 1;
        //randomNum range 1 - 10
        if(difficulty == 2)
            randomInt = rand.nextInt((100 - 1) + 1) + 1;
        if(difficulty == 3)
            randomInt = rand.nextInt((1000 - 1) + 1) + 1;

        System.out.println("I have my number. What's your guess?");

        return randomInt;
    }

    public static boolean testNumber(int guess, int answer)
    {
        if(guess < answer)
        {
            System.out.println("Too low. Guess again:");
            return false;
        }

        if(guess > answer)
        {
            System.out.println("Too high. Guess again:");
            return false;
        }
        return true;
    }
}