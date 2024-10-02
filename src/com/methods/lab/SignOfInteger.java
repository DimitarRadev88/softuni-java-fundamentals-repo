package com.methods.lab;

import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();

        printSighOfInteger(number);
    }

    private static void printSighOfInteger(int number) {
        System.out.printf("The number %d is %s.",number, number > 0 ? "positive" : number < 0 ? "negative" : "zero");
    }
}
