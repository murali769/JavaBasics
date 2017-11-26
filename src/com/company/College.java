package com.company;

public class College {


    public static void main(String[] args) {

        int id=700649723;


Student st=new Student();

st.age=28;
        System.out.println(st.age);
        System.out.println(st.studentid);

        Student st1=new Student(7006541);
        st1.age=20;
        System.out.println(st1.studentid);
        System.out.println(st1.age);

        Student st2=new Student(7006565,"Ravi","Teja","India",20);
        System.out.println(st2.age + " " + st2.firstName + " " +st2.country + " " + st2.lastName);

        Student s3=new Student(id);
        s3.age=26;

        if(s3.isElder()){
            System.out.println("He is elder");


        }
        if(st.isElder()){

            System.out.println("St is elder");
        }else{


            System.out.println("St is younger");
        }
        if(st1.isElder()){

            System.out.println("St1 is elder");
        }else{


            System.out.println("St1 is younger");
        }
        if(st2.isElder()){

            System.out.println(st2.firstName+ " is elder");
        }else{


            System.out.println(st2.firstName+ " is younger");
        }

    }
}
