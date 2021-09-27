package ex37;

import java.util.Random;

/**
 * FINISH
 * Hello world!
 *
 *
 * Example Output
 What's the minimum length? 8
 How many special characters? 2
 How many numbers? 2
 Your password is aurn2$1s#

 Constraints
 Use lists to store the characters you’ll use to generate the passwords.
 Ensure that the generated password is random.
 Ensure that there are at least as many letters are there are special characters and number.
 */
public class App
{
    public static void main( String[] args )
    {
        // Input stuff
        System.out.println("Hello World!");
    }

    public static String generatePassword(int minLength, int specialChar, int numbers)
    {
        Random rand = new Random();
        int passLength = rand.nextInt(((minLength + rand.nextInt(10)) - minLength) + minLength) + minLength;
        char[] passwordArr = new char[passLength];

        for(int i = 0; i < passLength - specialChar - numbers; i++)
        {
            passwordArr[i] = (char)(rand.nextInt(26) + 'a');
        }

        for(int i = passLength - specialChar - numbers; i < passLength + specialChar; i++)
        {
            // add special chars
        }

        for(int i = passLength - numbers; i < passLength + specialChar + numbers; i++)
        {
            // Add numbers
        }

        return passwordArr.toString();
    }
}