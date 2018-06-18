package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 1) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        char sc = 'C';

        switch (sc) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("Found " + sc);
                break;

            default:
                System.out.println("Didnt found A, B, C, D, E");
                break;
        }

        String month = "JANUary";

        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }


//        int switchValue = 6;
//
//        switch (switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//
//            case 3: case 4:case 5:
//                System.out.println("Was a 3, or a 4, or a 5");
//                System.out.println("Actually it was a " + switchValue);
//                break;
//
//            default:
//                System.out.println("Was not 1, 2, 3, 4 or 5");
//                break;
//        }

    }
}
