package com.myCompany;

public class VipPersons {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipPersons(){
        this("Default Name", 50000, "default@email.com");
    }
    public VipPersons(String name, double creditLimit) {
        this(name, creditLimit, "unknown@gmail.com");
    }
    public VipPersons(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
}
