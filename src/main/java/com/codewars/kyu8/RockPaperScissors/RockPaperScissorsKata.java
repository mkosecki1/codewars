package com.codewars.kyu8.RockPaperScissors;

public class RockPaperScissorsKata {
    public static final String ROCK = "rock";
    public static final String SCISSORS = "scissors";
    public static final String PAPER = "paper";

    public static String rps(String p1, String p2) {
        if (p1.equals(ROCK) && p2.equals(SCISSORS) || p1.equals(PAPER) && p2.equals(ROCK) || p1.equals(SCISSORS) && p2.equals(PAPER)) {
            return "Player 1 won!";
        } else if (p1.equals(ROCK) && p2.equals(ROCK) || p1.equals(SCISSORS) && p2.equals(SCISSORS) || p1.equals(PAPER) && p2.equals(PAPER)) {
            return "Draw!";
        }
        return "Player 2 won!";
    }

    /* ANOTHER SOLUTIONS:
    public static String rps(String p1, String p2) {
        return p1.equals(p2) ? "Draw!" : "Player " + ("scissorspaper paperrock rockscissors".contains(p1+p2)?1:2) + " won!";
    }

     public static String rps(String p1, String p2) {
        if (p1.equals(p2)) return "Draw!";

        Map<String, String> game = new HashMap<>();
        game.put("scissors", "paper");
        game.put("paper", "rock");
        game.put("rock", "scissors");

        String result = game.get(p1);
        if (result.equals(p2)) return "Player 1 won!";
        else                   return "Player 2 won!";
    }

    public static String rps(String p1, String p2) {
        if (p1.equals(ROCK) && p2.equals(SCISSORS)) {
            return "Player 1 won!";
        } else if (p1.equals(SCISSORS) && p2.equals(ROCK)) {
            return "Player 2 won!";
        } else if (p1.equals(ROCK) && p2.equals(PAPER)) {
            return "Player 2 won!";
        } else if (p1.equals(PAPER) && p2.equals(ROCK)) {
            return "Player 1 won!";
        } else if (p1.equals(ROCK) && p2.equals(ROCK)) {
            return "Draw!";
        } else if (p1.equals(SCISSORS) && p2.equals(PAPER)) {
            return "Player 1 won!";
        } else if (p1.equals(PAPER) && p2.equals(SCISSORS)) {
            return "Player 2 won!";
        } else if (p1.equals(SCISSORS) && p2.equals(SCISSORS)) {
            return "Draw!";
        } else if (p1.equals(PAPER) && p2.equals(PAPER)) {
            return "Draw!";
        }
        return "Wrong symbol";
    }
    */
}