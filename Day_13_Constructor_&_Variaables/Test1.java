package com.constructor;

class Student 
{

    String name;
    int rollNo;

    Student(String name, int rollNo)     //Constructor
    {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

public class Test1 {

    public static void main(String[] args) {

        Student s1 = new Student("Sanjay", 101);

        s1.display();
    }
}


/*

OUTPUT

      Name: Sai
      Roll No: 101
*/
