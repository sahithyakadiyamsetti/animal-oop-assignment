package com.revature.assignment1;

public class Wolf extends Canine {
    @Override
    public void makeNoise() {
        System.out.println("Wolf howls!");
    }

    @Override
    public void eat() {
        System.out.println("Wolf eats meat.");
    }
}
