package ex30;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron McDougal
 */
public class App
{
    public static void main( String[] args )
    {
        printMultiplicationTable(12, 12);
    }

    public static void printMultiplicationTable(int x, int y)
    {
        for(int i = 1; i <= x; i++)
        {
            for(int j = 1; j <= y; j++)
            {
                System.out.printf("%d", i * j);
                if(i * j > 99)
                    System.out.print("  ");
                else if(i * j > 9)
                    System.out.print("   ");
                else if(i * j > 0)
                    System.out.print("    ");
            }
            System.out.print("\n");
        }
    }
}