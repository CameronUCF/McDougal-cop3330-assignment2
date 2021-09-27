package ex26;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron McDougal
 */
public class App
{
    public static void main( String[] args )
    {
        double balance;
        double apr;
        double monthlyPayment;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your balance?");
        balance = scanner.nextDouble();

        System.out.println("What is the APR on the card (as a percent)?");
        apr = scanner.nextDouble();

        System.out.println("What is the monthly payment you can make?");
        monthlyPayment = scanner.nextDouble();

        scanner.close();

        PaymentCalculator payment = new PaymentCalculator(balance, apr, monthlyPayment);

        System.out.printf("It will take you %.0f months to pay off this card.", payment.calculateMonthsUntilPaidOff());
    }
}

class PaymentCalculator
{
    double balance;
    double apr;
    double monthlyPayment;

    PaymentCalculator(double balance, double apr, double monthlyPayment)
    {
        this.balance = balance;
        this.apr = apr / 36500;
        this.monthlyPayment = monthlyPayment;
    }

    public double calculateMonthsUntilPaidOff()
    {
        return Math.ceil((-1.0/30.0) * Math.log(1 + (this.balance / this.monthlyPayment) * (1 - Math.pow((1 + (this.apr)), 30))) / Math.log(1 + (this.apr)));
    }
}
