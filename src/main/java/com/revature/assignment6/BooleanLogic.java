package com.revature.assignment6;

public class BooleanLogic {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("!a = " + (!a));
        System.out.println("a | b = " + (a | b));
        System.out.println("(!a & b) | (a & !b) = " + ((!a & b) | (a & !b)));
    }
}
