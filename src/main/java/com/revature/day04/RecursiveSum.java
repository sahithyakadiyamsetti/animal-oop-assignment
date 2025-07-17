package com.revature.day04;

import java.util.Scanner;

public class RecursiveSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();
            int result=sum(num);

        System.out.println("Sum = " + result);
        scanner.close();
    }
    public static int sum(int n) {
        if (n<=1) {
            return n;
        } else {
            return n+sum(n-1);
        }
    }
}
