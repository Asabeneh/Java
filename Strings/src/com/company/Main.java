package com.company;

public class Main {

    public static void main(String[] args) {
            // write your code here
            //byte
            //short
            //int
            //long
            //float
            //double
            //char
            //boolean

        String myString = "This is a string";
        String firstName = "Asabeneh";
        String lastName = "Yetayeh";
        String fullName = firstName +  ' ' + lastName;
        System.out.println("myString is equal to "  + myString + " \u00A9 2015" );
        System.out.println(fullName);

        String numberString = "250.55";
        numberString = numberString + "49.95";

        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to "+ lastString);

        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastStrign value: " + lastString);


    }
}
