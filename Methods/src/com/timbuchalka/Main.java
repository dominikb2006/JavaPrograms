package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);


        highScore = 1500;
        displayHighScorePosition("Dominik", calculateHighScorePosition(highScore));
        highScore = 900;
        displayHighScorePosition("Adam", calculateHighScorePosition(highScore));
        highScore = 400;
        displayHighScorePosition("Rafal", calculateHighScorePosition(highScore));
        highScore = 50;
        displayHighScorePosition("Marek", calculateHighScorePosition(highScore));
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name+" managed to get into position "
                + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int finalScore) {
//        if (finalScore >= 1000) {
//            return 1;
//        } else if (finalScore >= 500) {
//            return 2;
//        } else if (finalScore >= 100) {
//            return 3;
//        }
//            return 4;

        int position = 4; // assuming position 4 will be returned

        if (finalScore >= 1000) {
            position = 1;
        } else if (finalScore >= 500) {
            position = 2;
        } else if(finalScore >= 100) {
            position = 3;
        }

        return position;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }
}
