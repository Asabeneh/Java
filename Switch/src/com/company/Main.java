package com.company;

public class Main {

    public static void main(String[] args) {
	int value = 3;
	if(value ==1 ){
        System.out.println("Value was 1");
    }
    if(value ==2){
        System.out.println("Value was 2");
    }
    if(value ==3 ){
        System.out.println("Value was 3");
    }
    else {
        System.out.println("Value was 1");
    }

int switchValue = 3;
    switch(switchValue){
        case 1:
            System.out.println("Value was 1");
            break;
        case 2:
            System.out.println("Value was 2");
            break;
        case 3:case 4:case 5:case 6:
            System.out.println("Value  was 3,4,5");
            System.out.println("Actually it was a " + switchValue);
            break;
        default:
            System.out.println("Was not 1,2, 3");
            break;
    }
    char charValue = 'C';
    switch(charValue){
        case 'A':
            System.out.println("A was found");
            break;
        case 'B':
            System.out.println("B was found");
            break;
        case 'C':case 'D':case 'E':
            System.out.println(charValue +  " was found");
            break;

        default:
            System.out.println("The letter is not A, B, C , D," + charValue);
            break;
    }
    String month = "January";
    switch(month.toLowerCase()){
        case "january":
            System.out.println("Jan");
            break;
        case "june":
            System.out.println("Jun");
            break;
        default:
            System.out.println("Not sure");
    }

}
}
