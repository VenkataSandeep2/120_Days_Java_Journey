package scom.Polymorphism_4;

public class Main {
	public static void main(String[] args) {
		FoodOrder fo = new FoodOrder();
		fo.order("Pizza");
		fo.order("burger",2);
		System.out.println("Hashcode of the order-> " + fo.hashCode());
	}

}
