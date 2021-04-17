package com.myCompany;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean first = true;
//        To avoid flag we can use:
//        int min = Integer.MIN_VALUE;
//        int max = Integer.MAX_VALUE;

        while(true){
            System.out.println("Enter Number: ");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                if(first){
                    first = false;
                    max = number;
                    min = number;
                }
                if(number > max){
                    max = number;
                }
                if (number < min){
                    min = number;
                }
            }else{
                break;
            }
            scanner.nextLine();
        }
        System.out.println("min = " + min + ", max = " + max);
        scanner.close();
    }
}
