package com.myCompany;

import java.util.ArrayList;

class IntClass{
    private int myValue;
    public IntClass(int myValue) {
        this.myValue = myValue;
    }
    public int getMyValue() {
        return myValue;
    }
    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        //We cannot use primitive data types for array list it only uses classes
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        //But to save us from long thing we use autoboxing and unboxing
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i = 0; i <= 10; i++){
            intArrayList.add(Integer.valueOf(i)); //it is called autoboxing
        }

        for(int i = 0; i <= 10; i++){
            System.out.println(i + " --> " + intArrayList.get(i).intValue()); //called unboxing
        }

        Integer myIntvalue = 56; //but at compile time it becomes Integer.valueOf(56);
        int myInt = myIntvalue; //here java is doing myInt.intValue(); automatically
    }
}
