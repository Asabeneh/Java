package com.company;

public class Main {

    public static void main(String[] args) {
        // while loop
        int count = 1;
        while(count!=6){
            System.out.println("Count value is " + count);
            count +=1;
        }

        count = 1;
        while(true){
            if(count == 5){
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }
        count = 1;
        // Do while
        do{
            System.out.println("Count value was " + count);
            count++;
        }while(count!=6);

        int startNum = 0;
        int finishNum = 50;
        count = 0;
      while(startNum <=finishNum){
            if (isEvenNumber(startNum)) {
                System.out.println( startNum + " is an even number.");
                count+=1;
                if(count >= 5){
                    break;
                }
            }
            else{
                //System.out.println(i+  " is not an even number.");
            }
            startNum+=1;
        }
        System.out.println("Total number of even numbers are " + count);


    }
    public static boolean isEvenNumber(int number){
        if(number == 0 || (number % 2  == 0)){

            return true;
        }
       else{

            return false;
        }

    }
}
