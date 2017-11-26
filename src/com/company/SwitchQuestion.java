package com.company;

public class SwitchQuestion {


    public static void main(String[] args) {

        int price = 6;

        switch (price) {

            case 2:
                System.out.println("It is :2");
            default:
                System.out.println("It is default");
            case 5:
                System.out.println("5");
            case 9:
                System.out.println("9");
                break;
        }
    }
}

