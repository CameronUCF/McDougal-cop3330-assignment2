package ex26;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cameron McDougal
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void isAccurate()
    {
        PaymentCalculator payment = new PaymentCalculator(5000, 12, 100);

        assertEquals(70, (int)payment.calculateMonthsUntilPaidOff());

        payment = new PaymentCalculator(5000, 6, 150);

        assertEquals(37, (int)payment.calculateMonthsUntilPaidOff());
    }
}
