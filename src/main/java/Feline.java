package com.revature.assignment1;

public abstract class Feline extends AbstractAnimal {
    @Override
    public void roam() {
        System.out.println(this.getClass().getSimpleName() + " roams alone.");
    }
}

