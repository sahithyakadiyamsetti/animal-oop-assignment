package com.revature.assignment8;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int x = 15;
        int y = 3;

        calc.add(x, y);
        calc.subtract(x, y);
        calc.multiply(x, y);
        calc.divide(x, y);
    }
}
