package com.revature.assignment1;

public class Lion extends Feline {
    @Override
    public void makeNoise() {
        System.out.println("Lion roars!");
    }

    @Override
    public void eat() {
        System.out.println("Lion eats meat.");
    }
}
