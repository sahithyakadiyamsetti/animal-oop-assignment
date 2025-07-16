package com.revature.assignment3;

public class TestCustomer {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.display();
        c1.display("Hello");


        Customer c2 = new Customer(101, "Sahithya");
        c2.display();
        c2.display("Welcome");
    }
}
