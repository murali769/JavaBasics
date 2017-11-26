package com.company;

public class StaticVariable {

    public static void main(String[] args) {

        Student id=new Student( );
        System.out.println("No of Objects " +Student.count);
        Student id1=new Student();
        System.out.println("No of Objects " +Student.count);
        Student id2=new Student(700649723);
        System.out.println("No of Objects " +Student.count);
        Student id3=new Student(7006565);

        System.out.println("No of Objects " +Student.count);
    }



}
