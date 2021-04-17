package com.myCompany;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1; i < 50; i++){
            if (isPrime(i)){
                count++;
                System.out.println("Number " + i + " is prime number.");
                if (count == 50){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i = 2; i <= n/2; i++){
            //We can also write for loop as for(int i = 2; i <= (long) Math.sqrt(n); i++)
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
