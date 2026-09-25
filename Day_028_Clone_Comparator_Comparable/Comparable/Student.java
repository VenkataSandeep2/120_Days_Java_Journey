package com.Comparable;

import java.util.*;

class Student implements Comparable<Student> {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

//    @Override
//    public int compareTo(Student other) {
//        return Integer.compare(this.id, other.id);
//    }
    @Override
    public int compareTo(Student o) {
    	return this.name.compareTo(o.name);
    }
    
    @Override
    public String toString() {
        return id + " - " + name;
    }


}
