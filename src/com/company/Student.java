package com.company;

public class Student {

    int studentid;
    String firstName;
    String lastName;
    String country;
    int age;
    static int count;
    int objCount;


    public Student(int studentid, String firstName, String lastName, String country, int age) {
        this.studentid = studentid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.age = age;

        count++;
        objCount++;
    }

   public Student() {
        count++;
        objCount++;

    }
        public Student(String mm){

        }
    public Student(int studentid) {
        this.studentid = studentid;
        count++;
        objCount++;
    }

    public boolean isElder(){

      if(this.age>25 || isUsCitizen()){

          return true;
      }
        return false;
    }
    public boolean isUsCitizen(){

        if(this.country.equals("US")){
            System.out.println(count);

            return true;
        }

        return false;
    }

    public int getStudentId(){
        return studentid;
    }
    public static int getCount(){

        Student st=new Student();
        System.out.println(st.age);
        return count;

        }
}

