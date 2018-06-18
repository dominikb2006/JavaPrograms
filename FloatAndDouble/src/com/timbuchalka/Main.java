package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        double converted=0.45359237d;
        double pounds =200d;
        double kg=pounds*converted;
        System.out.println("kg = "+kg);

        /*
        // width of int = 32 (4bytes)
        int myIntValue =5/3;
        // width of float = 32 (4bytes)
        float myFloatValue =5f/3f;
        // width of double = 64 (8bytes)
        double myDoubleValue=5d/3d;
        System.out.println("myIntValue= "+myIntValue);
        System.out.println("myFloatValue= "+myFloatValue);
        System.out.println("myDoubleValue= "+myDoubleValue);
        */
    }
}
