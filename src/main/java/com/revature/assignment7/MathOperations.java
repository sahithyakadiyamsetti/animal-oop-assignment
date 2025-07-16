package com.revature.assignment7;

public class MathOperations {
    public void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    public void subtract(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    public void multiply(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    public void divide(int a, int b) {
        System.out.println("Division: " + (a / b));
    }

    public static void main(String[] args) {
        MathOperations obj = new MathOperations();
        int x = 20;
        int y = 4;

        obj.add(x, y);
        obj.subtract(x, y);
        obj.multiply(x, y);
        obj.divide(x, y);
    }
}
