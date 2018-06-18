package com.timbuchalka;

class Main {

    public static void main(String[] args) {
//        printMegaBytesAndKiloBytes(486156186);
//        checkNumber(-5);
//        checkNumber(5);
//        checkNumber(0);
//        System.out.println(bark(true, 25));
//        System.out.println(isLeapYear(1800));
//        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.1756));
//        System.out.println(hasEqualSum(1,1,2);
//        System.out.println(hasTeen(20,1,845);
//        System.out.println(area(20,1));
//        System.out.println(area(20));
//        printYearsAndDays(181555861);
//        printEqual(1, 2, 0);
        System.out.println(isCatPlaying(true,40));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer == true) {
            if (temperature <= 45 && temperature >= 25) return true;
            return false;
        }
        if (temperature <= 35 && temperature >= 25) return true;
        return false;
    }


    public static void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) System.out.println("Invalid Value");
        else if (a == b && b == c) System.out.println("All numbers are equal");
        else if (a != b && b != c && a != c) System.out.println("All numbers are different");
        else System.out.println("Neither all are equal or different");
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) System.out.println("Invalid Value");
        else {
            long hours = minutes / 60;
            long rminutes = minutes % 60;
            long days = hours / 24;
            long rhours = hours % 24;
            long years = days / 365;
            long rdays = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + rdays + " d");
        }
    }

    public static double area(double radius) {
        if (radius < 0) return -1;
        double PI = 3.14159;
        double area = PI * radius * radius;
        return area;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) return -1;
        double area = x * y;
        return area;
    }


    public static boolean hasTeen(int a, int b, int c) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) return true;
        return false;
    }


    public static boolean hasEqualSum(int a, int b, int c) {
        if (a + b == c) return true;
        else return false;
    }

    public static boolean areEqualByThreeDecimalPlaces(double P1, double P2) {
        int p1 = (int) (P1 * 1000);
        int p2 = (int) (P2 * 1000);
        if (p1 == p2) return true;
        else return false;
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else {
            if (year % 4 == 0 && year % 100 != 0) {
                return true;
            } else if (year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static boolean bark(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else {
            if (barking == true) {
                if (hourOfDay < 8 || hourOfDay > 22) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int MegaBytes = kiloBytes / 1024;
            int kiloBytes2 = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + MegaBytes + " MB and " + kiloBytes2 + " KB");
        }
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else if (number == 0) {
            System.out.println("zero");
        }
    }
}
