package com.Interface;

public class TestClass {


    public static void main(String[] args) {

        MyFirstInterfaceImpl impl=new MyFirstInterfaceImpl();
        SecondImpl sc=new SecondImpl();
        impl.printMessage("Calling");
        impl.printNumber(10);
        sc.printMessage("Calling message");
        sc.printNumber(20);


    }

}
