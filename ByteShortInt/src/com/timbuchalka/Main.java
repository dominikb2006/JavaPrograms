package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        byte myByte=10;
        short myShort=20;
        int myInt=50;
        long myLong=50000+10*(myByte+myShort+myInt);
        short shortTotal=(short) (1000+10*(myByte+myShort+myInt));
        System.out.println(myLong);
        System.out.println(shortTotal);


        /*
        // Int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal=(myMinValue/2);
        System.out.println("myTotal = "+myTotal);

        // byte has w width of 8
        byte myByteValue=-128;
        byte myNewByteValue=(byte)(myByteValue/2);
        System.out.println("myNewByteValue = "+myNewByteValue);

        // short has a width of 16
        short myShortValue = 32767;
        short myNewShortValue=(short) (myShortValue/2);
        System.out.println("myNewShortValue = "+myNewShortValue);

        // long has a width of 64
        long myLongValue=100L;
*/
    }
}
