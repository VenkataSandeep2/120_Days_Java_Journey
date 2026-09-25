package com.Comprator;

import java.util.Comparator;

class NameComparator implements Comparator<Employee_Sal_Name> {

    @Override
    public int compare(Employee_Sal_Name s1, Employee_Sal_Name s2) {
        return s1.name.compareTo(s2.name);
    }
}