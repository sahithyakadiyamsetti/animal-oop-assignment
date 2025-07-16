package com.revature.assignment3;

public class Customer {
    static String companyName = "Amazon";
    final String country = "India";

    int id;
    String name;

    public Customer() {
        this.id = 0;
        this.name = "Unknown";
    }

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Company: " + companyName);
        System.out.println("Country: " + country);
    }

    public void display(String greeting) {
        System.out.println(greeting + ", " + name + "!");
    }
}
