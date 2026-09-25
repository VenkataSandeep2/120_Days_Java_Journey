package com.Comprator;

import java.util.Comparator;

class SalaryComparator implements Comparator<Employee_Sal_Name> {

    @Override
    public int compare(Employee_Sal_Name e1, Employee_Sal_Name e2) {
        return Double.compare(e1.salary, e2.salary);
    }
}
