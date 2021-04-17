package com.myCompany;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");

    public static void main(String[] args) {
        boolean quite = true;
        startPhone();
        printActions();
        while(quite){
            System.out.println("\nEnter action: (6 to show available actions) ");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("\nShutting down...");
                    quite = false;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void printContacts(){
        mobilePhone.printContacts();
    }

    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if (mobilePhone.addNewContact(newContact)){
            System.out.println("New Contact added: name = " + name + ", phone = " + phone);
        }else{
            System.out.println("Cannot add ," + name + " already on file.");
        }
    }
    private static void updateContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecords = mobilePhone.queryContact(name);
        if (existingContactRecords ==  null){
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Enter new Contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new Contact phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if(mobilePhone.updateContact(existingContactRecords, newContact)){
            System.out.println("Successfully updated record");
        }
        else {
            System.out.println("Error updating record.");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecords = mobilePhone.queryContact(name);
        if (existingContactRecords == null) {
            System.out.println("Contact not found.");
            return;
        }
        if(mobilePhone.removeContact(existingContactRecords)){
            System.out.println("Successfully Deleted");
        }else{
            System.out.println("Error Deleting contact");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecords = mobilePhone.queryContact(name);
        if (existingContactRecords == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Name: " + existingContactRecords.getName() + " phone number is" +
                existingContactRecords.getPhoneNumber());
    }

    private static void startPhone(){
        System.out.println("Starting Phone.....");
    }
    private static void printActions(){
        System.out.println("\nAvailable actions:\nPress");
        System.out.println("0 - to shut down\n" +
                "1 - to print contacts\n" +
                "2 - to add new contact\n" +
                "3 - to update an existing contact\n" +
                "4 - to remove an existing contact\n" +
                "5 - query if an existing contact exist\n" +
                "6 - to print a list of available actions.");
        System.out.println("Choose your action: ");

    }
}
