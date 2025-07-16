package com.revature.assignment1;

public class Hippo extends AbstractAnimal {
    @Override
    public void makeNoise() {
        System.out.println("Hippo grunts.");
    }

    @Override
    public void eat() {
        System.out.println("Hippo eats plants.");
    }

    @Override
    public void roam() {
        System.out.println("Hippo roams in water.");
    }
}
