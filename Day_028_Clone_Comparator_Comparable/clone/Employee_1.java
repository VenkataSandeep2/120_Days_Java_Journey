package com.clone;
class Employee_1 implements Cloneable {

    int id;
    String name;
    double salary;

    Employee_1(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public Employee_1 clone()throws CloneNotSupportedException 
    {

        return (Employee_1) super.clone();
    }
}
