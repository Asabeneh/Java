package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(("10,100 at 2% interest = " + calculateInterest(10000.0,2)));

        System.out.println(("10,100 at 3% interest = " + calculateInterest(10000.0,3)));
        System.out.println(("10,100 at 4% interest = " + calculateInterest(10000.0,4)));
        System.out.println(("10,100 at 5% interest = " + calculateInterest(10000.0,5)));

        //for loop
        for(int i = 2; i < 9; i++){
//            System.out.println("Loop = " + i);
            System.out.println("10,100 at " + i+ " % " + "interest = " + String.format("%.2f", calculateInterest(10000.0,i)));
        }

        for( int i = 8; i >=2; i--){
            System.out.println("10,100 at " + i+ " % " + "interest = " + String.format("%.2f", calculateInterest(10000.0,i)));

        }

        System.out.println(isPrime(15));
        int count = 0;
        for ( int i = 1; i < 101; i ++){

            if(isPrime(i)){
                System.out.println( "Number " + i + " is a prime number");
                count +=1;
                if(count == 50){
                    System.out.println("Existing for loop");
                    break;
                }
            }
        }
        System.out.println("Total number of prime numbers are " + count );

    }
    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for(int i = 2; i <=n/2; i++){
            System.out.println("Looping " + i);
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount *(interestRate/100));

    }
}
