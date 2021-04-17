package com.company;

import java.util.Scanner;

public class Main {

    static int sum(int a, int b){ //Static means this belongs to main
        return a+b;
    }

    public static void main(String[] args) {
	// write your code here

        //For printing on screen
        System.out.println("Hello World");

        //How to declare variables
        //<dataType> <variableName> = <value>

        String name = "Hello World! Second Time.";
        System.out.println(name);

        byte u = -56; //byte can store from -128 to 127.
        int a = 45, x = 43, y =20; //Grayed variable means they sre uninitialized
        float b = 45.22f; //f is necessary if giving value to float
        boolean isAdult = false;
        double c = 45.3424234d;
        char grade = 'A';

        System.out.println(a);
        System.out.println(b);
        System.out.println(isAdult);
        System.out.println(c);
        System.out.println(grade);

        //Rules For Constructing name of variable
        //Can contain digits, Underscores, dollar, letter but we do not use $ and _ at beginning but
        //it is a right syntax
        //Should not contain white spaces
        //Cannot use reserve keywords

        //Java Data Types:
        //1) Primitive Data Type:(We cannot store data larger than its limit)
            //byte(1 byte), Short(2 bytes), int(4 bytes), long(8 bytes), float (4 bytes),
            // double (8 bytes), Boolean (1 Bit), char (2 Bytes)
        //2) Non Primitive or Reference Data Type:

        //Operators in Java:
            //Arithmetic Operator: (+ - * / %)
            //Assignment Operators: (= += *= /= -= %=)
            //Logical Operators: (&& || !)
            //Comparison Operators: (== != < > <= >=)

        int num1 = 2, num2 = 30;
        System.out.print("The value of num1 + num2 is: ");
        System.out.println(num1 + num2); //Print use to print in same line while println in next line

        System.out.print("The value of num1 + num2 is: ");
        System.out.println(num1++); //First print value then increment

        System.out.print("The value of num1 + num2 is: ");
        System.out.println(--num2); //First decrement then print value

        Scanner scan = new Scanner(System.in); //Make object of scanner, Tell we
        // want to give input from keyboard
        System.out.println("Enter Input: ");
        String input = scan.nextLine(); //nextLine() gives a next line if we use only next then it will
        //stop after seeing white space and print only before white space.
        System.out.println(input);

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter Input a Number: ");
        int input1 = scan1.nextInt(); // Takes only int as input
        System.out.println(input1);

        String names = "Farasat";
        String state = "Good";
        System.out.println(name + " is a " + state + " boy.");
        System.out.println(names.length());
        System.out.println(names.toUpperCase());
        System.out.println(names.toLowerCase());

        //Escape Sequences:
            // \" for double quotes, \\ for backslash, \t for tab, \' for single quote,. \n for new line

        //The highlighted values will return always true or false because we have hard coded them
        System.out.println(names.contains("ara")); //Return bool value
        System.out.println(names.charAt(2)); //Give the character at 2 starts from 0
        System.out.println(names.endsWith("at")); //checks it have given characters at end
        System.out.println(names.indexOf("rr")); //gives first index where it is available

        int numb1 = 4, numb2 = 7;
        System.out.println(Math.max(numb1, numb2));
        System.out.println(Math.min(numb1, numb2));
        System.out.println(Math.sqrt(36));
        System.out.println(Math.abs(-5));
        System.out.println(Math.random());

        //To Print random number between two certain values
        System.out.println(4+(8-4)*Math.random()); //Print b/w 4 & 8

        //If - else Conditionals
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter your Age:");
        int age = myScan.nextInt();

        if(age > 20){
            System.out.println("You are an adult.");
        }
        else if (age > 5){
            System.out.println("You are not a kid.");
        }
        else {
            System.out.println("You are a kid.");
        }

        //Switch Statements
        switch (age){
            case 12:
                System.out.println("You are 12 years old.");
                break;
            case 45:
                System.out.println("You are 45 years old.");
                break;
            default:
                System.out.println("You did not match any of the cases");
                break;
        }

        //While
        int i = 0;
        while(i < 10){
            System.out.print(i + " ");
            i += 1;
        }

        //Do-While
        do{
            System.out.print(i + " ");
            i += 1;
        }while(i < 10);
        System.out.println();

        for (int j = 0; j < 10; j++){
            if(j == 4){
                continue;
            }
            if(j == 8){
                break;
            }
            System.out.print(j + " ");
            i += 1;
        }

        //Arrays
        int [] marks = {1, 2, 3, 4};
        System.out.println(marks[0]);
        marks[3] = 34;
        System.out.println(marks[3]);
        for (int j = 0; j < marks.length; j++){
            System.out.println(marks[j]);
        }

        //For each loop
        for(int value:marks){
            System.out.println(value);
        }

        int [][] matrix = {
                {1,2,3},
                {4,5,6}
        };
        System.out.println(matrix[0][1]);

        String [] cars = {"Harry", "Mruti", "Suzuki", "Innova", "Ford"};
        for (String value:cars) {
            System.out.println(value);
        }

        //Try Catch
        //In this it will try to do but this will catch the error
        try{
            System.out.println(cars[5]);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Massom");
        System.out.println(sum(2,5));


    }
}
