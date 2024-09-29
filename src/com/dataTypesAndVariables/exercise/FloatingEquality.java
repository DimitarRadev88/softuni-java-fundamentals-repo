package com.dataTypesAndVariables.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FloatingEquality {

    private static final double PRECISION_EPS = 0.000001;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double difference = Double.parseDouble(reader.readLine()) - Double.parseDouble(reader.readLine());

        if (Math.abs(difference) > PRECISION_EPS) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }

    }
}
