package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println(" my Minimum Integer Value : " + myMinIntValue);
        System.out.println(" my Maximum Integer Value : " + myMaxIntValue);

        byte myByteMinValue = Byte.MIN_VALUE;
        byte myByteMaxValue = Byte.MAX_VALUE;
        System.out.println("my Minimum Byte Value : " + myByteMinValue);
        System.out.println("my Maximum Byte Value : " + myByteMaxValue);

        short myShortMinValue = Short.MIN_VALUE;
        short myShortMaxValue = Short.MAX_VALUE;
        System.out.println("my Minimum Short Value : " + myShortMinValue);
        System.out.println("my Maximum Short Value : " + myShortMaxValue);

        long myLongMinValue = Long.MIN_VALUE;
        long myLongMaxValue = Long.MAX_VALUE;
        System.out.println("my Minimum Long Value : " + myLongMinValue);
        System.out.println("my Maximum Long Value : " + myLongMaxValue);

        long bigLongLiteraValue = 2147483647;
        System.out.println( bigLongLiteraValue);
    }
}
