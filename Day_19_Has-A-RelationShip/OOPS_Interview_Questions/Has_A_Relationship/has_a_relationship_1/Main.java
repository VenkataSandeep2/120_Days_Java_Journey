package com.has_a_relationship_1;

public class Main
{
    public static void main(String[] args)
    {
      
        Teacher t1 = new Teacher(101, "Ravi Ran");

      
        Department d1 = new Department(10, "CSE", t1);

        System.out.println(t1);

        System.out.println(d1);
    }
}
