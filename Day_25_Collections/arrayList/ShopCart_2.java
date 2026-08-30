package com.arrayList;

import java.util.ArrayList;

public class ShopCart_2 {
	public static void main(String[] args)
    {
        ArrayList<String> cart = new ArrayList<>();

        cart.add("Mobile");
        cart.add("Laptop");
        cart.add("Mouse");
        cart.add("Keyboard");

        System.out.println("Cart : " + cart);

        cart.remove("Mouse");

        System.out.println("removed Updated Cart : " + cart);
}
}
