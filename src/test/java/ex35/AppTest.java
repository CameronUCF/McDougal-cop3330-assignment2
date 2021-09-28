package ex35;

import org.junit.Test;

import java.util.ArrayList;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
public class AppTest
{
    @Test
    public void validWinner()
    {
        ArrayList<String> participants = new ArrayList<String>();
        participants.add("Cameron");
        participants.add("Jake");
        participants.add("Mason");
        participants.add("Dan");

        String winner = App.pickRandomWinner(participants);

        for(int i = 0; i < participants.size(); i++)
        {
            if(participants.get(i).equals(winner))
            {
                assert(true);
                return;
            }
        }

        assert(false);
    }
}
