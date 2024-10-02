package com.methods.lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = scanner.nextDouble();
        int power = scanner.nextInt();

        printPower(getPower(num, power));
    }

    private static void printPower(double power) {
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println(df.format(power));
    }

    private static double getPower(double num, int power) {
        return Math.pow(num, power);
    }
}
