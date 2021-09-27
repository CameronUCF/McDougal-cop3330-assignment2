package ex29;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Hello world!
 * TODO: Maybe add function for input
 */
public class App
{
    public static void main( String[] args )
    {
        int rateOfRet;
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            try
            {
                System.out.println("What is the rate of return?");
                rateOfRet = scanner.nextInt();
                if(rateOfRet <= 0)
                {
                    System.out.println("Sorry. That's not a valid input. Must be greater than 0.");
                    continue;
                }
                break;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Sorry. That's not a valid input.");
                scanner.next();
            }
        }
        scanner.close();

        System.out.printf("It will take %.0f years to double your initial investment.", calculateRule(rateOfRet));
    }

    static double calculateRule(double rateOfRet)
    {
        return 72.0 / rateOfRet;
    }
}