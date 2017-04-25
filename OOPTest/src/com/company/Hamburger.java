package com.company;

/**
 * Created by Asab on 4/24/2017.
 */
public class Hamburger {

    private String name;
    private String meat;
    private  double price;
    private String breadRollType;


    private String addition1Name;
    private double additon1Price;

    private String addition2Name;
    private double additon2Price;

    private String addition3Name;
    private double additon3Price;

    private String addition4Name;
    private double additon4Price;


    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHumburgerAddition1(String name,double price){
        this.addition1Name = name;
        this.additon1Price = price;

    }
    public void addHumburgerAddition2(String name,double price){
        this.addition2Name = name;
        this.additon2Price = price;

    }
    public void addHumburgerAddition3(String name,double price){
        this.addition3Name = name;
        this.additon3Price = price;

    }
    public void addHumburgerAddition4(String name,double price){
        this.addition4Name = name;
        this.additon4Price = price;

    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + " on a"+ this.breadRollType + " roll"
        + "price is "+ this.price);
        if(this.addition1Name != null){
            hamburgerPrice+=this.additon1Price;
            System.out.println("Added "+this.addition1Name + "for an extra "+ this.additon1Price);
        }
        if(this.addition2Name != null){
            hamburgerPrice+=this.additon2Price;
            System.out.println("Added "+this.addition2Name + "for an extra "+ this.additon2Price);
        }
        if(this.addition3Name != null){
            hamburgerPrice+=this.additon3Price;
            System.out.println("Added "+this.addition3Name + "for an extra "+ this.additon3Price);
        }
        if(this.addition4Name != null){
            hamburgerPrice+=this.additon4Price;
            System.out.println("Added "+this.addition4Name + "for an extra "+ this.additon4Price);
        }
        return hamburgerPrice;
    }

}
