package com.set;

import java.util.HashSet;

public class Set_1 {

    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();

        names.add("Sandeep");
        names.add("Ravi");
        names.add("Kiran");
        names.add("Ravi");
        names.add("Ravi");
        System.out.println("Names "+names);
        
        System.out.println("Names hashcode"+names.hashCode());
        
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        System.out.println("Int set"+numbers);
        
        System.out.println("---"+numbers.contains(10));
        
        

        HashSet<String> name = new HashSet<>();

        name.add("Sandeep");
        name.add(null);
        name.add("Ravi");
        name.add(null);

        System.out.println(name);
        
        HashSet<String> skills = new HashSet<>();

        skills.add("Java");
        skills.add("SQL");
        skills.add("Spring");

        System.out.println(skills);
        
        HashSet<String> skill = new HashSet<>();
        System.out.println(skill.add("Java"));
        System.out.println(skill.add("SQL"));
        System.out.println(skill);
        
        System.out.println(skill.contains("Java"));
        
        
        skills.remove("SQL");
        System.out.println(skills);
        
        System.out.println(skills.size());
        System.out.println(skill.size());
        
        System.out.println("Is it empty :- "+skills.isEmpty());
        
        skills.clear();
        System.out.println(skills);
        
        for (String skil : skill) 
        {
            System.out.println("    -"+skil);
        }



    }
}