package com.myCompany;

public class Main {
    
    public static void main(String[] args) {
        
//        int newScore = calculateScore("Tim", 500);
//        System.out.println("New Score is: " + newScore);
//        newScore = calculateScore(75);
//        System.out.println("New Score is: " + newScore);
//        calculateScore();
        
        double centimeters = CalcFeetAndInchesToCentimeters(7, 5);
        centimeters = CalcFeetAndInchesToCentimeters(7, -5);
        if(centimeters < 0){
            System.out.println("Invalid Parameters");
        }
        CalcFeetAndInchesToCentimeters(100);
    }

    public static double CalcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet < 0) || ((inches < 0) || (inches > 12))){
            System.out.println("Invalid Feet on Inches");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches " + centimeters + " centimeters");
        return centimeters;
    }
    
    public static double CalcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches = " + feet + " feet and " + remainingInches + " inches.");
        return CalcFeetAndInchesToCentimeters(feet, remainingInches);
    }
    
//    public static int calculateScore(String playerName, int score){
//        System.out.println("Player " + playerName + " scored " + score + " points");
//        return score * 1000;
//    }
//    
//    public static int calculateScore(int score){
//        System.out.println("Unnamed Player" + " scored " + score + " points");
//        return score * 1000;
//    }
//    
//    public static int calculateScore(){
//        System.out.println("No Player name" + " No scored" + " points");
//        return 0;
//    }
}
