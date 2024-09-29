package com.dataTypesAndVariables.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LowerToUpper {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(Character.isUpperCase(reader.readLine().charAt(0)) ? "upper-case" : "lower-case");
    }
}
