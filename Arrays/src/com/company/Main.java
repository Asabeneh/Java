package com.company;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for(int i = 0; i < myIntegers.length; i++){
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);

        }

        System.out.println("The average is " + getAverage(myIntegers));



//	int[] myIntArray1 = new int[]{5,6,7,8,9,10};
//    myIntArray1[0] = 0;
//    myIntArray1[1] = 1;
//    myIntArray1[2] = 2;
//    myIntArray1[3] = 3;
//    myIntArray1[4] = 4;
//    myIntArray1[5] = 5;

 int[] myIntArray = new int[10];
 double[] myDoubleArray = new double[10];

        printArray(myIntArray);
        printArrayReverse(myIntArray);
        printArrayAverage(myIntArray);
        printArraySquare(myIntArray);


    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();

        }
        return values;
    }
    public static double getAverage(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum+=array[i];
        }
        return (double) sum/(double)array.length;
    }

    public  static void printArray(int[] array){
        for(int i = 0; i< array.length; i++){
            array[i]= i;
            System.out.println("Element "+ i + ", the square is " + array[i]);

        }
    }
    public  static int printArraySum(int[] array){
        int sum = 0;
        for(int i = 0; i< array.length; i++){
            sum+=array[i];
//            array[i]= i*i;
        }
        System.out.println("The sum is equal to  " + sum);
        return sum;
    }
    public  static double printArrayAverage(int[] array){
        double average = (double)printArraySum(array)/(array.length);

        System.out.println("The average is " +average );
        return average;

    }
    public  static void printArrayReverse(int[] array){
        int[] tempArray = new int[array.length];

        for(int i = 0; i< array.length; i++){
            tempArray[i]= array[array.length-1-i];
            System.out.print(" " + tempArray[i]);

        }
//        System.out.println("The square of "+ i + " is  " + array[i]);

    }

    public  static void printArraySquare(int[] array){
        for(int i = 0; i< array.length; i++){
            array[i]= i * i;
            System.out.println("The square of "+ i + " is  " + array[i]);

        }


    }





}
