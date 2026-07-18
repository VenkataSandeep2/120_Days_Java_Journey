package com.HierachicalInheritance;

public class Main 
{
	public static void main(String[] args) {
		Son son = new Son();
		son.m1();
		son.m2();
		System.out.println("Hashcode of the son  object is -> " +son.hashCode());
		Daughter dag = new Daughter();
		dag.m1();
		dag.m3();
		System.out.println("Hashcode of the Daughter object is ->"+dag.hashCode());
	}

}
