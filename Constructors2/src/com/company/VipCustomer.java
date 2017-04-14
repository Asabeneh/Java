package com.company;

/**
 * Created by Asab on 4/12/2017.
 */
public class VipCustomer {
    private String name;
    private String emailAddress;
    private double creditLime;

    public VipCustomer() {
        this("Default name", 50000.00,"Default email");
        System.out.println("Empty constructor called");
    }
    public VipCustomer(String name, double creditLime,String emailAddress) {
        System.out.println("Constructors with parameters");
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLime = creditLime;

    }
    public VipCustomer(String name, double creditLimit) {
        this( name, creditLimit, "unkown email");

    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public double getCreditLime() {
        return creditLime;
    }
}
