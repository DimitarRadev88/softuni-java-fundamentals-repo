package com.dataTypesAndVariables.exercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = scanner.nextInt();
        int capacity = scanner.nextInt();

        System.out.println(people / capacity + (people % capacity != 0 ? 1 : 0));
    }
}
