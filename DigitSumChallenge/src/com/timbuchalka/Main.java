package com.timbuchalka;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigits(11111111));
    }

    public static int sumDigits(int number) {
        if (number >= 10) {
            int rest;
            int sum = 0;
            while (number > 0) {
                rest = number % 10;
                number = number / 10;
                sum += rest;
            }
            return sum;
        } else return -1;
    }
}
