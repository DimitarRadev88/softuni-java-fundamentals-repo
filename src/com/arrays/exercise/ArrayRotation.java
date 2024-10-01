package com.arrays.exercise;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");

        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotations; i++) {
            arr = rotate(arr);
        }

        System.out.println(String.join(" ", arr));
    }

    private static String[] rotate(String[] arr) {
        String first = arr[0];
        String[] newArr = new String[arr.length];
        System.arraycopy(arr, 1, newArr, 0, arr.length - 1);
        newArr[arr.length - 1] = first;
        return newArr;
    }

}
