package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

       int highScore =  calculateScore(gameOver, score, levelCompleted,bonus);
        System.out.println("Your high score " + highScore);
        calculateScore(true, 10000,8,100);

        score = 80000;
        levelCompleted = 10;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted,bonus);
        System.out.println("Your final score was " +  highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob",highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy",highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert",highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Louise",highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Carol",highScorePosition);


        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Frank",highScorePosition);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        else{
            return 0;
        }

    }
    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println( playerName + " managed to get into position " + highScorePosition+ " on the high score table");


    }
    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        }
        else if(playerScore>=500 && playerScore < 1000){
            return 2;
        }
        else if(playerScore >= 100 && playerScore < 500){
            return 3;
        }
        else{
            return 4;
        }


    }
    }

