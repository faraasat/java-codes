package com.myCompany;

public class Main {

    public static void main(String[] args) {
	    SomeClass one = new SomeClass("one");
	    SomeClass two = new SomeClass("two");
	    SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

//        one.instanceNumber = 4;

        System.out.println(Math.PI);
        System.out.println(Math.E);
//        Math.PI = 3;
//        Math m = new Math();

        int pw = 674312;
        Password password = new ExtendedPassword(pw);
        password.storePassword();
        password.letMeIn(2443);
        password.letMeIn(pw);

        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);
    }
}
