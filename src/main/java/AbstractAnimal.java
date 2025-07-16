package com.revature.assignment1;

public abstract class AbstractAnimal implements Animal {
    public String picture;
    public String food;
    public int hunger;
    public String boundaries;
    public String location;

    @Override
    public void sleep() {
        System.out.println(this.getClass().getSimpleName() + " is sleeping.");
    }
}
