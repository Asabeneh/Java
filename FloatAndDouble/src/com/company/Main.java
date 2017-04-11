package com.company;

public class Main {

    public static void main(String[] args) {
	// float is single precison and double is double precision
// width of int = 32 (4 bytes)
        int myIntValue =5/2;
        // widht of float = 32( 4 bytes)
        float myFloatValue = 5f/3f; // seven precision
        // width of double = 64 (8 bytes)
        double myDoubleValue = 5d/3f; // 16 precision

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        //challengs
        double numPounds = 200d;
        double numberOfKillograms = numPounds * 0.45359237d;
        System.out.println( "The number of killograms is "  + numberOfKillograms);



    }
}
