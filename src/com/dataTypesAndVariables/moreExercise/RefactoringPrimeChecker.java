package com.dataTypesAndVariables.moreExercise;

import java.util.Scanner;

public class RefactoringPrimeChecker {

//    REFACTOR CODE
//Scanner chetec = new Scanner(System.in);
//
//    int ___Do___ = Integer.parseInt(chetec.nextLine());
//for (int takoa = 2; takoa <= ___Do___; takoa++) {
//        boolean takovalie = true;
//        for (int cepitel = 2; cepitel < takoa; cepitel++) {
//            if (takoa % cepitel == 0) {
//                takovalie = false;
//                break;
//            }
//        }
//        System.out.printf("%d -> %b%n", takoa, takovalie);
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int endRange = Integer.parseInt(scanner.nextLine());
        for (int current = 2; current <= endRange; current++) {
            System.out.printf("%d -> %b%n", current, isPrimeNumber(current));
        }

    }

    private static boolean isPrimeNumber(int number) {
        for (int divisor = 2; divisor < number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
