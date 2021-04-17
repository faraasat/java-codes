package com.myCompany;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0, sum = 0;

        //while(true){
        while(counter < 10){
            int order = counter + 1;
            System.out.println("Enter Number #" + order + ":");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                counter++;
                sum += number;
//                if(counter == 10){
//                    break;
//                }
            }else{
                System.out.println("Invalid Number");
            }
            scanner.nextLine(); //handle end of line enter key
        }
        System.out.println("sum = " + sum);
        scanner.close();
    }
}
