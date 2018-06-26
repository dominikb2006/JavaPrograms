package com.timbuchalka;

class Main {

    public static void main(String[] args) {

//        checkNumber(-5);
//        checkNumber(5);
//        checkNumber(0);
//        printMegaBytesAndKiloBytes(486156186);
//        System.out.println(bark(true, 25));
//        System.out.println(isLeapYear(1800));
//        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.1756));
//        System.out.println(hasEqualSum(1,1,2);
//        System.out.println(hasTeen(20,1,845);
//        System.out.println(area(20,1));
//        System.out.println(area(20));
//        printYearsAndDays(181555861);
//        printEqual(1, 2, 0);
//        System.out.println(isCatPlaying(true,40));
//        printNumberInWord(0);
//        System.out.println(isLeapYear(1992));
//        System.out.println(getDaysInMonth(2, 1992));
//        forstatement();
//        System.out.println(sumOdd(10,20));
//        System.out.println(isPalindrome(-111));
//        System.out.println(sumFirstAndLastDigit(11));
//        System.out.println(getEvenDigitSum(234));
//        System.out.println(hasSharedDigit(12, 21));
//        System.out.println(hasSameLastDigit(889,89,10));


    }
//skonczone na GreatestCommonDivisor
    public static boolean hasSameLastDigit(int a,int b,int c){
        if(a<10||a>1000||b<10||b>1000||c<10||c>1000) return false;
        else{
            int a1=a%10;
            int b1=b%10;
            int c1=c%10;
            if(a1==b1||a1==c1||b1==c1) return true;
            else return false;
        }
    }

    public static boolean hasSharedDigit(int start, int end) {
        if (start < 10 || start > 99 || end < 10 || end > 99) return false;
        else {
            int s1, s2, e1, e2;
            s1 = start % 10;
            s2 = start / 10 % 10;
            e1 = end % 10;
            e2 = end / 10 % 10;
            if (s1 == e1 || s1 == e2 || s2 == e1 || s2 == e2) return true;
            else return false;
        }
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        } else {
            int sum = 0;
            int rest;
            while (number > 0) {
                rest = number % 10;
//                 if (number % 2 == 0) {
                if (isOdd(rest) == false) {
                    sum += rest;
                }
                number /= 10;
            }
            return sum;
        }
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number >= 0) {
            int last = number % 10;
            while (number >= 10) {
                number /= 10;
            }
            int first = number;
            int sum = first + last;
            return sum;
        } else return -1;
    }

    public static boolean isPalindrome(int number) {
        int src = number;
        int reverse = 0;
        int temp;
        while (number != 0) {
            reverse *= 10;
            temp = number % 10;
            number /= 10;
            reverse += temp;
        }
        if (src == reverse) return true;
        else return false;
    }

    public static boolean isOdd(int number) {
        if (number > 0) {
            if (number % 2 != 0) {
                return true;
            }
            return false;
        } else return false;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (end >= start && end > 0 && start > 0) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i) == true) {
                    sum += i;
                }
            }
            return sum;
        } else return -1;
    }

    public static void forstatement() {
        int sum = 0;
        int n = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                n++;
                System.out.println(i);
            }
            if (n == 5) break;
        }
        System.out.println("Sum is " + sum);
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) return -1;
        else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                case 2:
                    if (isLeapYear(year) == true) return 29;
                    else return 28;
                default:
                    return -1;
            }
        }
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
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

//    public static boolean isLeapYear(int year) {
//        if (year < 1 || year > 9999) {
//            return false;
//        } else {
//            if (year % 4 == 0 && year % 100 != 0) {
//                return true;
//            } else if (year % 400 == 0) {
//                return true;
//            } else {
//                return false;
//            }
//        }
//    }

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
