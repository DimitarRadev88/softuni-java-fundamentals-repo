package com.dataTypesAndVariables.lab;

import java.util.Scanner;

public class RefactorSpecialNumbers {
//    code refactoring
//    Scanner scanner = new Scanner(System.in);
//int kolkko = Integer.parseInt(scanner.nextLine());
//int obshto = 0;
//int takova = 0;
//boolean toe = false;
//for (int ch = 1; ch <= kolkko; ch++) {
//    takova = ch;
//    while (ch > 0) {
//        obshto += ch % 10;
//        ch = ch / 10;
//    }
//    toe = (obshto == 5) || (obshto == 7) || (obshto == 11);
//    System.out.printf("%d -> %b%n", takova, toe);
//    obshto = 0;
//    ch = takova;
//}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int current = 1; current <= number; current++) {
            int temp = current;
            int sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            boolean isSpecial = (sum == 5) || (sum == 7) || (sum == 11);
            System.out.printf("%d -> %s%n", current, isSpecial ? "True" : "False");
        }

    }
}
