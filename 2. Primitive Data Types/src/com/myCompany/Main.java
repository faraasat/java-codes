package com.myCompany;

public class Main {

    public static void main(String[] args) {

        //A Byte occupies 8 bits. A bit is not directly represented in a primitive type.
        //A short occupies 16 bits.
        //An int occupies 32 bits.
        //An int occupies 64 bits.
        //An float occupies 32 bits.
        //A double occupies 64 bits.
        //A char occupies 16 bits.

        //Here int is primitive data type while Integer is a wrapper class and it always used to
        //perform different operations on int
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum value: " + myMinIntValue);
        System.out.println("Integer Maximum value: " + myMaxIntValue);
        //If you try to put a larger than the value will overflow
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
        //If you try to put a lesser than the value will underflow
        System.out.println("Busted Min Value = " + (myMinIntValue - 1));
        int myMaxIntTest = 2_147_483_647; //We can put _ to make our number clear to us

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum value: " + myMinByteValue);
        System.out.println("Byte Maximum value: " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum value: " + myMinShortValue);
        System.out.println("Short Maximum value: " + myMaxShortValue);

        long myLongValue = 100L; //We put 'L' to tell computer that it is a long. We can also put
        //'l' but it matches 1 therefore we avoid. And if we do not put L it treats a number as int
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum value: " + myMinLongValue);
        System.out.println("Long Maximum value: " + myMaxLongValue);

        int myNewIntValue = (myMinIntValue / 2);
        //Since it is considering myMinByteValue as int so we type casted into byte.
        byte myNewByteValue = (byte)(myMinByteValue / 2);

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value: " + myMinFloatValue);
        System.out.println("Float Maximum Value: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value: " + myMinDoubleValue);
        System.out.println("Double Maximum Value: " + myMaxDoubleValue);

        int myInt1 = 5 / 3;
        float myFloat1 = 5f/ 3f;
        double myDouble1 = 5d/ 3d;
        System.out.println("My Int Value: " + myInt1);
        System.out.println("My Float Value: " + myFloat1);
        System.out.println("My Double Value: " + myDouble1);

        char myChar = 'D';
        //Unicode ia an international encoding system.
        //Unicode allows us to represent 65535 different types of characters and it works by using
        //a combination of two bytes that char takes up in memory.
        char myUnicodeChar = '\u0044';
        char myUnicodeChar1 = '\u0623';
        char myUnicodeChar2 = '\u067E';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        System.out.println(myUnicodeChar1);
        System.out.println(myUnicodeChar2);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

    }
}
