package com.timbuchalka;

public class Main {

    private static final String INVALID_VALUE_MESSAGE="Invalid value";

    public static void main(String[] args) {

        System.out.println(getDurationString(61, 45));
        System.out.println(getDurationString(3661));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65,9));
    }

    public static String getDurationString(int min, int sec) {
        if (min >= 0 && sec >= 0 && sec <= 59) {
            int h = min / 60;
            int rMin = min % 60;

            String Sh = h + "h";
            String Smin = rMin + "m";
            String Ssec = sec + "s";
            if (h < 10) {
                Sh = "0" + Sh;
            }
            if (rMin < 10) {
                Smin = "0" + Smin;
            }
            if (sec < 10) {
                Ssec = "0" + Ssec;
            }
            return Sh + " " + Smin + " " + Ssec;
        }
        return INVALID_VALUE_MESSAGE;
    }

    public static String getDurationString(int sec) {
        if (sec >= 0) {
            int min = sec / 60;
            int rSec = sec % 60;
            return getDurationString(min, rSec);
        }
        return INVALID_VALUE_MESSAGE;
    }
}
