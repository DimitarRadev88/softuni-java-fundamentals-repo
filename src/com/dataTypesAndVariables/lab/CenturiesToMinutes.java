package com.dataTypesAndVariables.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CenturiesToMinutes {

    private static final double YEARS_MULTIPLICAND = 100;
    private static final double DAYS_MULTIPLICAND = 365.2422;
    private static final double HOURS_MULTIPLICAND = 24;
    private static final double MINUTES_MULTIPLICAND = 60;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int centuries = Integer.parseInt(reader.readLine());

        System.out.printf("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes",
                centuries,
                centuries * YEARS_MULTIPLICAND,
                centuries * YEARS_MULTIPLICAND * DAYS_MULTIPLICAND,
                centuries * YEARS_MULTIPLICAND * DAYS_MULTIPLICAND * HOURS_MULTIPLICAND,
                centuries * YEARS_MULTIPLICAND * DAYS_MULTIPLICAND * HOURS_MULTIPLICAND * MINUTES_MULTIPLICAND);
    }

}
