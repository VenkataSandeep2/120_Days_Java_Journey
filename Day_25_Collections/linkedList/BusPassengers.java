package com.linkedList;
import java.util.LinkedList;

public class BusPassengers
{
    public static void main(String[] args)
    {
        LinkedList<String> passengers =
                new LinkedList<>();

        // Add passengers
        passengers.add("Sai");
        passengers.add("Ravi");
        passengers.add("Kiran");

        System.out.println(
                "Passengers: " + passengers);

        // Passenger enters at the beginning
        passengers.addFirst("Arjun");

        System.out.println(
                "After adding first: "
                + passengers);

        // Passenger enters at the end
        passengers.addLast("Rahul");

        System.out.println(
                "After adding last: "
                + passengers);

        // Get first passenger
        System.out.println(
                "First passenger: "
                + passengers.getFirst());

        // Get last passenger
        System.out.println(
                "Last passenger: "
                + passengers.getLast());

        // Update passenger
        passengers.set(1, "Suresh");

        System.out.println(
                "After update: "
                + passengers);

        // Check passenger
        System.out.println(
                "Is Sai present? "
                + passengers.contains("Sai"));

        // Passenger leaves from beginning
        passengers.removeFirst();

        System.out.println(
                "After first passenger leaves: "
                + passengers);

        // Passenger leaves from end
        passengers.removeLast();

        System.out.println(
                "After last passenger leaves: "
                + passengers);

        // Total passengers
        System.out.println(
                "Total passengers: "
                + passengers.size());

        // Display all passengers
        System.out.println(
                "Final Passenger List:");

        for(String passenger : passengers)
        {
            System.out.println(passenger);
        }
    }
}