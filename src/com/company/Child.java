package com.company;

public class Child extends Parent {

    @Override
    public void print() {
        System.out.println("Hi I'm in child class ");

    }

    public int multiplyByFive(int a){
        return a*5;
    }

    public static void main(String[] args) {


        Parent p=new Parent();
        Child c=new Child();
        System.out.println(p.multiplyByFour(5));
        p.print();

        System.out.println(c.multiplyByFive(5));
        System.out.println(c.multiplyByFour(4));

        c.print();
        System.out.println("#############");
        Parent p1=new Child();
        p1.print();
        System.out.println(p1.multiplyByFour(4));

        Child c1=(Child)new Parent();
        c1.print();
        System.out.println(c1.multiplyByFour(4));

    }
}
