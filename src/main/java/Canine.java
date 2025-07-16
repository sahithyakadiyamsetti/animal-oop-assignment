package com.revature.assignment1;

public abstract class Canine extends AbstractAnimal {
    @Override
    public void roam() {
        System.out.println(this.getClass().getSimpleName() + " roams in packs.");
    }

    public static class Wolf extends Canine {
        @Override
        public void makeNoise() {
            System.out.println("Wolf howls!");
        }

        @Override
        public void eat() {
            System.out.println("Wolf eats meat.");
        }
    }
}
