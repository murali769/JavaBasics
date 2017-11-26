package com.Interface;

public class MyFirstInterfaceImpl implements MyFirstInterface {


    @Override
    public void printMessage(String message) {
        System.out.println("The received string is " +message);
    }

    @Override
    public void printNumber(int i) {
        System.out.println("The given number is " +i);

    }
}
