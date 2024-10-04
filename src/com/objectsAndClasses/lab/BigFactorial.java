package com.objectsAndClasses.lab;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        System.out.println(getFactorial(new BigInteger(number)));
    }

    private static BigInteger getFactorial(BigInteger number) {
        if (number.longValue() < 2) {
            return new BigInteger("1");
        }

        return number.multiply(getFactorial(new BigInteger(String.valueOf(number.longValue() - 1))));
    }
}
