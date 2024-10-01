package com.dataTypesAndVariables.exercise;

import java.util.Scanner;

public class WaterOverflow {
    private static final int INITIAL_TANK_CAPACITY = 255;
    private static int POURED_WATER = 0;
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        pourWater();

        System.out.println(POURED_WATER);
    }

    private static void pourWater() {
        int lines = SCANNER.nextInt();
        for (int i = 0; i < lines; i++) {
            int water = SCANNER.nextInt();

            if (POURED_WATER + water <= INITIAL_TANK_CAPACITY) {
                POURED_WATER += water;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
    }
}
