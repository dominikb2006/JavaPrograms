package com.timbuchalka;

import com.sun.jdi.IntegerValue;

public class Main {
    public static void main(String[] args) {
        //int newScore = calculateScore("Tim", 500);
        //System.out.println("New score is " + newScore);
        //calculateScore(75);
        //calculateScore();
//        double inches = 157;
//
//        if (calcFeetAndInchesToCentimeters(inches) < 0.0) {
//            System.out.println("Invalid parameters");
//        }
        System.out.println(areEqualByThreeDecimalPlaces(3.175,3.1756));


    }
    public static boolean areEqualByThreeDecimalPlaces(double P1,double P2){
        int p1=(int)(P1*1000);
        int p2=(int)(P2*1000);
        if (p1==p2) return true;
        else return false;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            double cm = (feet * 12 + inches) * 2.54;
            System.out.println(feet + " feet, " + inches + " inches = " + cm + " cm");
            return cm;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            if (inches >= 12) {
                double feet = (int) inches / 12;
                inches = (int) inches % 12;
                return calcFeetAndInchesToCentimeters(feet, inches);
            }
            return calcFeetAndInchesToCentimeters(0, inches);
        }
        return -1;
    }


    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No plater name, no plater score.");
        return 0;
    }

}