package com.arrays.moreExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursiveFibonacci {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        System.out.println(getFibonacci(n));
    }

    private static int getFibonacci(int n) {
        if (n <= 2) {
            return 1;
        }

        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }
}
