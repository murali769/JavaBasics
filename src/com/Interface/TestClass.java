package com.Interface;

public class TestClass {


    public static void main(String[] args) {

        MyFirstInterfaceImpl impl=new MyFirstInterfaceImpl();
        SecondImpl sc=new SecondImpl();
        impl.printMessage("Calling");
        impl.printNumber(10);
        sc.printMessage("Calling message");
        sc.printNumber(20);

        MyFirstInterface mi=new MyFirstInterfaceImpl();
        mi.printMessage("Interface");
        mi=new SecondImpl();
        mi.printMessage("Interface");

    }

}
