package ex27;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron McDougal
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        validateInputs(scanner);

        scanner.close();
    }

    static void validateInputs(Scanner scanner)
    {
        String firstName;
        String lastName;
        String zip;
        String empID;

        // Get all inputs before validating them
        System.out.println("Enter the first name:");
        firstName = scanner.nextLine();

        System.out.println("Enter the last name:");
        lastName = scanner.nextLine();

        System.out.println("Enter the ZIP code:");
        zip = scanner.nextLine();

        System.out.println("Enter the employee ID:");
        empID = scanner.nextLine();
        scanner.close();

        int errors = 0;
        if(!validateFirstName(firstName))
        {
            System.out.println("The first name must be at least 2 characters long.");
            errors++;
        }
        if(!validateLastName(lastName))
        {
            System.out.println("The last name must be at least 2 characters long.\nThe last name must be filled in.");
            errors++;
        }
        if(!validateEmployeeID(empID))
        {
            System.out.println("The employee ID must be in the format of AA-1234.");
            errors++;
        }
        if(!validateZip(zip))
        {
            System.out.println("The zipcode must be a 5 digit number.");
            errors++;
        }

        if(errors == 0)
            System.out.println("There were no errors found.");
    }

    static boolean validateFirstName(String firstName)
    {
        if(firstName.length() < 2)
            return false;

        return true;
    }

    static boolean validateLastName(String lastName)
    {
        if(lastName.length() < 2)
            return false;

        return true;
    }

    static boolean validateZip(String zip)
    {
        if(zip.matches("^[0-9]{5}"))
            return true;

        return false;
    }

    static boolean validateEmployeeID(String empID)
    {
        if(empID.matches("^\\D\\D-[0-9]{4}"))
            return true;

        return false;
    }
}