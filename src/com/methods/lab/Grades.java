package com.methods.lab;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        double grade = new Scanner(System.in).nextDouble();

        printGradeLiteral(grade);
    }

    private static void printGradeLiteral(double grade) {
        String message = "Excellent";

        if (grade < 3) {
             message = "Fail";
        } else if (grade < 3.50) {
            message = "Poor";
        } else if (grade < 4.50) {
            message = "Good";
        } else if (grade < 5.50) {
            message = "Very good";
        }

        System.out.println(message);
    }
}
