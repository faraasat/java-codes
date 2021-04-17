package com.myCompany;

public class Main {

    public static void main(String[] args) {

        boolean isAlien = true;
        if(isAlien == false)
            System.out.println("It is not an alien!");
            System.out.println("I am Scared!");

        int topScore = 100;
        if(topScore == 100){
            System.out.println("You got the High Score");
        }
        int SecondTopScore = 60;
        if(topScore > SecondTopScore && topScore < 100){
            System.out.println("Great!");
        }
        else {
            System.out.println("Oh no!");
        }

        boolean isCar = false;
        if(!isCar){
            System.out.println("This is not supposed to happen");
        }

        //Ternary Operator
        boolean wasCar = isCar ? true:false;
        if (wasCar){
            System.out.println("wasCar is True");
        }

        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient == 20) ?true:false;
        System.out.println(isEighteenOrOver);


    }
}
