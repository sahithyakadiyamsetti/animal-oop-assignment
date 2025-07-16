package com.revature.assignment1;

public class Cat extends Feline {
    @Override
    public void makeNoise() {
        System.out.println("Cat meows.");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats fish.");
    }
}
