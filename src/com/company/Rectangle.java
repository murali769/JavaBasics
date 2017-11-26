package com.company;

public class Rectangle {

    int len,brd;
    Employee e;



    public Rectangle(int a,int b){
        this.len=a;
        this.brd=b;
       this.e=new Employee("Ravi");

    }
public int area(){

    System.out.println(e.getEmployeeName());
        return len*brd;
}


    public static void main(String[] args) {

    Rectangle r=new Rectangle(10,5);

        System.out.println(r.area());




    }
}
