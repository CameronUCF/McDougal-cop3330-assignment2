package ex37;

import java.util.Scanner;
import java.util.Random;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's the minimum length?");
        int length = scanner.nextInt();

        System.out.println("How many special characters are there?");
        int specChar = scanner.nextInt();

        System.out.println("How many numbers?");
        int numbers = scanner.nextInt();

        System.out.printf("Your password is %s", generatePassword(length, specChar, numbers));
    }

    public static String generatePassword(int minLength, int specialChar, int numbers)
    {
        Random rand = new Random();
        int passLength = rand.nextInt(((minLength + rand.nextInt(5)) - minLength) + minLength) + minLength;
        char[] passwordArr = new char[passLength];
        String specCharacters = "!@#$%^&*()=+-_.";

        System.out.printf("passLength: %d\nspecialChar: %d\nnumbers: %d\n", passLength, specialChar, numbers);

        for(int i = 0; i < passLength - (specialChar + numbers); i++)
        {
            passwordArr[i] = (char)(rand.nextInt(26) + 'a');
        }

        for(int i = passLength - (specialChar + numbers); i < passLength - specialChar; i++)
        {
            passwordArr[i] = specCharacters.charAt(rand.nextInt(specCharacters.length()));
        }

        for(int i = passLength - numbers; i < passLength; i++)
        {
            passwordArr[i] = (char)(rand.nextInt(9) + '0');
        }

        String pass = new String(passwordArr);

        return pass;
    }
}