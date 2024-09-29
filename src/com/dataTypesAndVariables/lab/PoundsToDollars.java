package com.dataTypesAndVariables.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PoundsToDollars {

    private static final double POUND_TO_DOLLAR_EXCHANGE_RATE = 1.36;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double pounds = Double.parseDouble(reader.readLine());

        System.out.println(getFormattedDollarsFromPounds(pounds));
    }

    private static String getFormattedDollarsFromPounds(double pounds) {
        return String.format("%.3f", pounds * POUND_TO_DOLLAR_EXCHANGE_RATE);
    }

}
