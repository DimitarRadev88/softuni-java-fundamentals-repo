package com.methods.lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();

        System.out.println(multiplySumOfEvensAndOdds(number));
    }

    private static int multiplySumOfEvensAndOdds(int number) {
        return getSumOfEvens(number) * getSumOfOdds(number);
    }

    private static int getSumOfOdds(int number) {
        return getSum(number, n -> n % 2 != 0);
    }

    private static int getSumOfEvens(int number) {
        return getSum(number, n -> n % 2 == 0);
    }

    private static int getSum(int number, Predicate<Integer> predicate) {
        return Arrays.stream(String.valueOf(Math.abs(number))
                        .split(""))
                .mapToInt(Integer::parseInt).filter(predicate::test).sum();
    }


}
