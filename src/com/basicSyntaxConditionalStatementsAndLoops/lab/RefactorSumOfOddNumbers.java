package com.basicSyntaxConditionalStatementsAndLoops.lab;

import java.util.Scanner;

// Debug and refactor code
//Scanner sc = new Scanner(System.in);
//int n = Integer.parseInt(sc.nextLine());
//int sum = 1;
//for (int i = 0; i <= n; i++) {
//        System.out.print(2 * i + 1);
//sum += 2 * i;
//}
//        System.out.printf("Sum: %d%n", sum);

public class RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int number = 2 * i + 1;
            System.out.println(number);
            sum += number;
        }

        System.out.printf("Sum: %d%n", sum);
    }
}
