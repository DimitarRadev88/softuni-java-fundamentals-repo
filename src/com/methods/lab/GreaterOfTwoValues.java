package com.methods.lab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        printGreater(type, scanner);
    }

    private static void printGreater(String type, Scanner scanner) {
        switch (type) {
            case "int":
                System.out.println(getMax(scanner.nextInt(), scanner.nextInt()));
                break;
            case "char":
                System.out.println(getMax(scanner.nextLine().charAt(0), scanner.nextLine().charAt(0)));
                break;
            case "string":
                System.out.println(getMax(scanner.nextLine(), scanner.nextLine()));
        }
    }

    private static String getMax(String first, String second) {
        return first.compareTo(second) > 0 ? first : second;
    }

    private static int getMax(int first, int second) {
        return Math.max(first, second);
    }
    private static char getMax(char first, char second) {
        return (char) Math.max(first, second);
    }

}

