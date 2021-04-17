package com.myCompany;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("NBP");
        bank.addBranch("Karachi");
        bank.addCustomer("Karachi", "Tim", 50.05);
        bank.addCustomer("Karachi", "Mike", 324.2);
        bank.addCustomer("Karachi", "Percy", 345.4);

        bank.addBranch("Lahore");
        bank.addCustomer("Lahore", "Bob", 24.345);

        bank.addCustomerTransaction("Karachi", "Mike", 324.234);
        bank.addCustomerTransaction("Karachi", "Tim", 353.4);
        bank.addCustomerTransaction("Karachi", "Tim", 56.5);
        bank.addCustomerTransaction("Karachi", "Mike", 67.7);

        bank.listCustomers("Karachi", true);
        bank.listCustomers("Lahore", true);

//        bank.addBranch("Islamabad");
        if (!bank.addCustomer("Islamabad", "Brian"
                , 53.3)){
            System.out.println("Error Islamabad do not exist");
        }

        if (!bank.addBranch("Karachi")){
            System.out.println("Karachi branch already exist.");
        }

        if (!bank.addCustomerTransaction("Karachi", "Fergus", 35.4)){
            System.out.println("Customer do not exist.");
        }

        if (!bank.addCustomer("Karachi", "Tim", 32.3)){
            System.out.println("Customer already exist");
        }

    }
}
