package com.myCompany;

public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account("1234", 0.00, "Bob Brown",
                "myemail@bob.com", "(087) 123-4567");
        Account defaultAccount = new Account();

        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);

        Account timAccount = new Account("Tim's Account",
                "tim@gmail.com", "021 434 3432");
        System.out.println("Number is: " + timAccount.getNumber() + " and name is: " +
                timAccount.getCustomerName());

        VipPersons person1 = new VipPersons();
        System.out.println(person1.getName());

        VipPersons person2 = new VipPersons("Bob", 25000);
        System.out.println(person2.getName());

        VipPersons person3 = new VipPersons("Tim", 100,
                "tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }
}
