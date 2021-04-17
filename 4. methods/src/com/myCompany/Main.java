package com.myCompany;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your Final Score Was: " + highScore);

        highScore = calculateScore(true, 1000, 8, 300);
        System.out.println("Your Final Score Was: " + highScore);

        int highScorePosition = CalculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = CalculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position " +
                highScorePosition +" on the high score position");
    }

    public static int CalculateHighScorePosition(int playerScore){
        if (playerScore > 1000){
            return 1;
        }
        else if(playerScore > 500 && playerScore < 1000){
            return 2;
        }
        else if(playerScore > 100 && playerScore < 500){
            return 3;
        }
        else{
            return 4;
        }
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        else{
            return -1;
        }
    }

}
