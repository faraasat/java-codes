package com.myCompany;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter year of birth");
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); //handle next line character key

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2018 - yearOfBirth;

            if (age >= 0 && age <= 100){
                System.out.println("Your name is: " + name + ", and your age is: " + age);
            }else{
                System.out.println("Invalid Year of Birth");
            }
        }else {
            System.out.println("Unable to parse year of birth. ");
        }

        scanner.close();
    }
}
