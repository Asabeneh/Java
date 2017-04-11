package com.company;

public class Main {

    public static void main(String[] args) {
        // int has a widht fo 32

        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue)/2;
        System.out.println("myTotal = " + myTotal);

// byte has a width of 8
        byte myByteMinValue = -128;
        byte myByteMaxValue = 127;
        byte myNewByteValue = (byte)(myByteMaxValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);
        // short has a width of 16
        short myShortMinValue = 32767;
//long has a width of 64 2 power of 63
        long myLongValue = 100L;
        long myLongMaxValue = 9_223_372_036_854_775_807L;
        System.out.println(myLongMaxValue);
//Quize
byte firstByte = 10;
short firstShort = 20;
int firstInt = 50;
long longTotal = 50000L + 10L* (firstByte + firstShort + firstInt);
short shortTotal  = (short)(1000 + 10 *(firstByte + firstShort + firstInt));
        System.out.println("The resutt will be:" + longTotal);
        System.out.println("The resutt will be:" + shortTotal);


    }
}
