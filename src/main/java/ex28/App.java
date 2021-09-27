package ex28;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        int[] numbers = new int[5];
        int total = 0;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 5; i++)
        {
            System.out.println("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.printf("The total is %d", countTotal(numbers));
    }

    public static int countTotal(int[] numbers)
    {
        int total = 0;

        for (int i = 0; i < 5; i++)
            total += numbers[i];

        return total;
    }
}