package com.Comparable;

class Book implements Comparable<Book> {

    String title;
    double price;

    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

//    @Override
//    public int compareTo(Book other) {
//        return this.title.compareTo(other.title);
//    }
//    
    @Override
    public int compareTo(Book other) 
    {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return title + " - ₹" + price;
    }
}