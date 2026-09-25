package com.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Example 
{
	public static void main(String[] args) {
		Map<Integer, String> stud = new HashMap<>();
		stud.put(1,"sa");
		stud.put(2,"sannnn");
		stud.put(3,"sannnnddddddd");
		stud.put(4,"sanndeeeeeeeeee");
		stud.put(5,"sanndeepppppppppp");
		
		stud.put(7,"sambasrinusiva");
		
		System.out.println(stud);
		
		System.out.println("Duplicates-----------");
		stud.put(3,"sanndeep");
		stud.put(5,"sanjay");
		System.out.println(stud);
		
		String name = stud.get(7);
		System.out.println("Name of id 7 :-   "+name);
		
		System.out.println(stud.get(4));
		System.out.println(stud.get(5));
		
		System.out.println(stud.containsKey(5));
		System.out.println(stud.containsKey(120));
		
		System.out.println(stud.containsValue("sanjay"));
		System.out.println(stud.containsValue("ram"));
		
		stud.remove(7);
		System.out.println(stud);
		
		System.out.println(stud.size());
		
		stud.put(8,"ramm");
		System.out.println(stud.size());
		
		System.out.println(stud.isEmpty());
		
		stud.clear();
		System.out.println(stud.isEmpty());
		
		
	}

}
