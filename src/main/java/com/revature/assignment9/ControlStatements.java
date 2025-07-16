package com.revature.assignment9;

public class ControlStatements {
    public static void main(String[] args) {
        int x = 10;

        if (x > 5) {
            System.out.println("if statement: x is > 5");
        }

        if (x > 20) {
            System.out.println("This won't print");
        } else {
            System.out.println("if-else statement: x is not > 20");
        }

        int y = 2;
        switch (y) {
            case 1:
                System.out.println("switch: One");
                break;
            case 2:
                System.out.println("switch: Two");
                break;
            default:
                System.out.println("switch: Default");
        }

        System.out.println("for loop:");
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("while loop:");
        int a = 0;
        while (a < 2) {
            System.out.println("a = " + a);
            a++;
        }

        System.out.println("do-while loop:");
        int b = 0;
        do {
            System.out.println("b = " + b);
            b++;
        } while (b < 2);

        System.out.println("break and continue inside loop:");
        for (int i = 0; i < 5; i++) {
            if (i == 2) continue;
            if (i == 4) break;
            System.out.println("i = " + i);
        }
    }
}
