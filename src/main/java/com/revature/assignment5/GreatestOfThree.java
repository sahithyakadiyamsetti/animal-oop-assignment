package com.revature.assignment5;

public class GreatestOfThree {
    public static void main(String[] args) {
        int a = 45;
        int b = 75;
        int c = 30;
        if (a >= b && a >= c) {
            System.out.println("Greatest: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Greatest: " + b);
        } else {
            System.out.println("Greatest: " + c);
        }
    }
}
