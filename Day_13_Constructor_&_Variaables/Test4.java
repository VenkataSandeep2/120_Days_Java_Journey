package com.constructor;

class FoodOrder 
{

    String foodName;
    int quantity;

    FoodOrder(String foodName, int quantity) 
    {
        this.foodName = foodName;
        this.quantity = quantity;
    }

    void display() 
    {
        System.out.println("Food: " + foodName);
        System.out.println("Quantity: " + quantity);
    }
}

public class Test4
{
    public static void main(String[] args) 
    {

        FoodOrder order =
            new FoodOrder("Biryani", 2);

        order.display();
    }
}



                /*
                OUTPUT
                Food: Biryani
                Quantity: 2
                
                
                
                
                */
