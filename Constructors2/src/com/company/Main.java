package com.company;

public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account("12345",0.00, "Bob, Brown","myemail@bob.com","((087) 123-4567)");
//        bobsAccount.setNumber("12345");
//        bobsAccount.setBalance(0.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmailAddress("myemail@bob.com");
//        bobsAccount.setCustomerPhoneNumber("((087) 123-4567)");
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);

        Account timsAccount = new Account("Tim", "tim@tim.com", "12345");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());

        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());
        VipCustomer customer2 = new VipCustomer("Bob", 25000.00);
        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLime());
        VipCustomer customer3 = new VipCustomer("Tim",100);
        System.out.println(customer3.getName());
        System.out.println(customer3.getEmailAddress());
        System.out.println(customer3.getCreditLime());
    }
}
