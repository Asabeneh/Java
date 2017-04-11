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
      while(startNum <=finishNum){
            if (!isEvenNumber(startNum)) {
                startNum+=1;
                continue;
            }
          System.out.println(startNum + " is an even number.");

        }


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
