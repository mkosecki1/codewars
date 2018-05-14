package com.codewars.kyu8.RockPaperScissors;

import static org.junit.Assert.*;
import org.junit.Test;

public class RockPaperScissorsKataTest {

    @Test
    public void test1() {
        System.out.println("Fixed Tests Player 1 won!");
        assertEquals("Player 1 won!", RockPaperScissorsKata.rps("rock", "scissors"));
        assertEquals("Player 1 won!", RockPaperScissorsKata.rps("scissors", "paper"));
        assertEquals("Player 1 won!", RockPaperScissorsKata.rps("paper", "rock"));
    }
    @Test
    public void test2() {
        System.out.println("Fixed Tests Player 2 won!");
        assertEquals("Player 2 won!", RockPaperScissorsKata.rps("scissors", "rock"));
        assertEquals("Player 2 won!", RockPaperScissorsKata.rps("paper", "scissors"));
        assertEquals("Player 2 won!", RockPaperScissorsKata.rps("rock", "paper"));
    }
    @Test
    public void test3() {
        System.out.println("Fixed Tests Draw!");
        assertEquals("Draw!", RockPaperScissorsKata.rps("scissors", "scissors"));
        assertEquals("Draw!", RockPaperScissorsKata.rps("paper", "paper"));
        assertEquals("Draw!", RockPaperScissorsKata.rps("rock", "rock"));
    }

}