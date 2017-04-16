package com.company;

public class Main {
    //create a class and demonstrate proper encapsulation techniques
    //the class will be called Printer
    // It will simulate a real Computer Printer
    // It should have fields for the toner Level , number of pages printed, and
    // also whether its a duplex printer(capable of printing on both sides of the paper).
    //Add methods to fill up the toner (up to a maximum of 100 %),another method to
    // Simulate printing a page (which should increase the number of pages printed).
    // Decide on the scope, whether to use constructors, an anything else you think is need.

    public static void main(String[] args) {
	// write your code here

        Printer printer = new Printer(50,true);
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);

        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = "+pagesPrinted);
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = "+pagesPrinted);
    }
}
