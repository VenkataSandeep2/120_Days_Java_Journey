package com.constructor;
class Mobile {

    String brand;
    double price;

    Mobile(String brand, double price) 		//Constructor
    {
        this.brand = brand;
        this.price = price;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}

public class Test3 {
    public static void main(String[] args) {

        Mobile m = new Mobile("Samsung", 25000);

        m.display();
    }
}


                /*
                OUTPUT
                
                Brand: Samsung
                Price: 25000.0
      */
