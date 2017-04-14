package com.company;

/**
 * Created by Asab on 4/12/2017.
 */
public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account(){
        this("56789", 2.50, "Default name", "Default adress", "default phone");
        System.out.println("Empty constructor called");

    }
    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber){
        System.out.println("Account constructors with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;

    }

    public void deposit(double depositAmount){

        this.balance +=depositAmount;
        System.out.println("Deposit of " + depositAmount  + " made. New balance is " + this.balance);
    }
    public void withdrawal(double withdrawalAmount){
        if(balance - withdrawalAmount <=0){
            System.out.println("Only " + balance + " available. Withdrawal not processed");
        }
        else{
            balance-=withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount  + " processed. Remaining balance = " + balance);
        }
    }
    public void setNumber(String number){
        this.number = number;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setCustomerEmailAddress(String customerEmailAddress){
        this.customerEmailAddress = customerEmailAddress;
    }
    public void setCustomerPhoneNumber(String customerPhoneNumber){
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getNumber(){
        return this.number;
    }
    public double getBalance(){
        return this.balance;
    }

    public String getCustomerName(){
        return this.customerName;
    }
    public String getCustomerEmailAddress(){
        return this.customerEmailAddress;
    }
    public String getCustomerPhone(){
        return this.customerPhoneNumber;
    }

}
