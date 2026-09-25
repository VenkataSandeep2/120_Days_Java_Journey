package com.Comprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Emplote_Test 
{
	public static void main(String[] args) {

        List<Employee_Sal_Name> employees = new ArrayList<>();

        employees.add(new Employee_Sal_Name(101, "Ravi", 70000));
        employees.add(new Employee_Sal_Name(102, "Sandeep", 30000));
        employees.add(new Employee_Sal_Name(103, "Kiran", 90000));
        employees.add(new Employee_Sal_Name(104, "Aura Kiran", 40000));
        Collections.sort(employees, new SalaryComparator());

        for (Employee_Sal_Name e : employees) {
            System.out.println(e);
        }
        
        System.out.println();
        System.out.println();
        Collections.sort(employees, new NameComparator());

        for (Employee_Sal_Name e : employees) {
            System.out.println(e);
        }
    
	}

}
