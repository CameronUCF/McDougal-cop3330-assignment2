package ex25;

import java.util.Scanner;

/*
 TODO: Finish last case
*/

/**
 * A very weak password contains only numbers and is fewer than eight characters.
 A weak password contains only letters and is fewer than eight characters.
 A strong password contains letters and at least one number and is at least eight characters.
 A very strong password contains letters, numbers, and special characters and is at least eight characters.
 */
public class App
{
    public static void main( String[] args )
    {
        String password;
        String strengthStr;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password:");
        password = scanner.nextLine();
        scanner.close();

        int securityLevel = passwordValidator(password);
        switch(securityLevel)
        {
            case 0:
                strengthStr = "very weak";
                break;
            case 1:
                strengthStr = "weak";
                break;
            case 2:
                strengthStr = "strong";
                break;
            case 3:
                strengthStr = "very strong";
                break;

            default:
                System.out.println("Invalid Password Strength.");
                return;
        }

        System.out.printf("The password '%s' is a %s.", password, strengthStr);
    }

    // Levels 0 - very weak, 1 - weak, 2 - strong, 3 - very strong
    public static int passwordValidator(String password)
    {
        if(password.matches("[0-9]+") == true && password.length() < 8)
            return 0;

        if(password.matches("[a-zA-Z]+") == true && password.length() < 8)
            return 1;

        if(password.matches("[a-zA-Z0-9]+") == true && password.length() >= 8)
            return 2;

        // Pattern matches with special characters
        return 3;
    }
}
