package com.company;

/**
 * Created by Asab on 4/25/2017.
 */
public class DeluxeBurger extends Hamburger{
    public DeluxeBurger(){
        super("Deluxe", "Sausage & Bacon", 14.54,"White");
        super.addHumburgerAddition1("Chips",2.75);
        super.addHumburgerAddition2("Drink",1.81);
    }

    @Override
    public void addHumburgerAddition1(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHumburgerAddition2(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHumburgerAddition3(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHumburgerAddition4(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }
}
