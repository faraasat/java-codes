package com.myCompany;

public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(1234556);
        timsPhone.powerOn();
        timsPhone.callPhone(1234556);
        timsPhone.answer();

        System.out.println();
        timsPhone = new MobilePhone(5674354);
        timsPhone.callPhone(5674354 );
        timsPhone.answer();
        System.out.println();
        timsPhone.powerOn();
        timsPhone.callPhone(5674354 );
        timsPhone.answer();
    }
}
