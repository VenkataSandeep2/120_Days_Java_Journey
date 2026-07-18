package com.HierachicalInheritance_1;

public class Main 
{
	public static void main(String[] args) 
	{
		Dog dog = new Dog();
		dog.eat();
		dog.sound();
		System.out.println("HashCode of the Object is "+dog.hashCode());
		System.out.println();
		
		Cat cat = new Cat();
		cat.eat();
		cat.sound();
		System.out.println("HashCode of the Object is "+cat.hashCode());
		System.out.println();
		
		Snake snake = new Snake();
		snake.eat();
		snake.sound();
		System.out.println("HashCode-> "+snake.hashCode());
				
	}

}
