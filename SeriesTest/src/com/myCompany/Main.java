package com.myCompany;

import com.myCompany.com.myCompany.mylibrary.Series;

public class Main {

    public static void main(String[] args) {
        System.out.println("N-Sum");
        for (int i = 0; i <= 10; i++){
            System.out.print(Series.nSum(i) + " ");
        }
        System.out.println("\nFactorial");
        for (int i = 0; i <= 10; i++){
            System.out.print(Series.factorial(i) + " ");
        }
        System.out.println("\nFibonacci");
        for (int i = 0; i <= 10; i++){
            System.out.print(Series.fibonacci(i) + " ");
        }
    }
}
