package com.timbuchalka;

public class Main {
    public static void main(String[] args) {
//        int count = 1;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//        count = 1;
//        while (true) {
//            if (count == 6) break;
//            System.out.println("Count value is " + count);
//            count++;
//        }
//        count = 1;
//        do {
//        System.out.println("Count value is " + count);
//            count++;
//            if (count > 100) break;
//
//        } while (count != 6);

        int number = 4;
        int finishNumber = 20;
        int count = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            count++;
            System.out.println("Even number " + number);
            if (count == 5) {
                System.out.println("Total even numbers is " + count);
                break;
            }
        }

    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}