package com.dataTypesAndVariables.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertMetersToKilometers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int meters = Integer.parseInt(reader.readLine());

        System.out.println(convertToKilometers(meters));
    }

    private static String convertToKilometers(int meters) {
        return String.format("%.2f", meters / 1000.0);
    }

}
