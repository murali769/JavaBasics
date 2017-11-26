package com.Interface;

public class SecondImpl implements MyFirstInterface {


    @Override
    public void printMessage(String message){

        System.out.println("RECEIVED MESSAGE IS " +message.toUpperCase());


    }

    @Override
    public void printNumber(int i){

        System.out.println("Received number is " +i+10);

    }
}
