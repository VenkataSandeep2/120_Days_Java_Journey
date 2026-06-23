package com.practise;

class Employee 
{

    protected int employeeId = 101;
    void display() 
    {
        System.out.println("Employee ID: " + employeeId);
    }

}
public class EmployeeDetails
{

    public static void main(String[] args) 
    {

    	Employee d = new Employee();

        d.display();
    }
}

            /*
            
            OUTPUT
              Employee ID: 101
        */
