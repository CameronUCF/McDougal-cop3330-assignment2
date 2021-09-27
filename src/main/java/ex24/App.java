package ex24;

import java.util.Arrays;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron McDougal
 */
public class App
{
    public static void main( String[] args )
    {
        String string1;
        String string2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams:\nEnter the first string:");
        string1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        string2 = scanner.nextLine();

        scanner.close();

        if(isAnagram(string1, string2))
            System.out.printf("\"%s\" and \"%s\" are anagrams", string1, string2);
        else
            System.out.printf("\"%s\" and \"%s\" are not anagrams", string1, string2);
    }

    public static boolean isAnagram(String string1, String string2)
    {
        char[] word1 = string1.toLowerCase().toCharArray();
        char[] word2 = string2.toLowerCase().toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);

        if(Arrays.equals(word1, word2) && word1.length == word2.length)
            return true;

        return false;
    }
}