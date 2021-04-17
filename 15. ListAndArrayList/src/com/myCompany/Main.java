package com.myCompany;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("Press");
        System.out.println("0 - to print choice options.");
        System.out.println("1 - to print the list of grocery item.");
        System.out.println("2 - to add an item to the list.");
        System.out.println("3 - to modify an item to the list.");
        System.out.println("4 - to remove an item from the list.");
        System.out.println("5 - to Search an item in the list.");
        System.out.println("6 - to to quit the application.");
    }

    public static void addItem(){
        System.out.println("Please Enter grocery items.");
        groceryList.addGroceryItems(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Enter item Name: ");
        String itemNo = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem(){
        System.out.print("Enter item Name: ");
        String itemNo = scanner.nextLine();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchItem(){
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem + " in our grocery list.");
        }
        else {
            System.out.println(searchItem + " is not in the shopping list.");
        }
    }

    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}
