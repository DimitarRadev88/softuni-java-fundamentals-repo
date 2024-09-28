package com.basicSyntaxConditionalStatementsAndLoops.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MonthPrinter {

    private static final String[] MONTHS = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
    };

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int monthNumber = Integer.parseInt(reader.readLine()) - 1;

        System.out.println(getMonthName(monthNumber));

    }

    private static String getMonthName(int monthNumber) {
        try {
            return MONTHS[monthNumber];
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Error!";
        }
    }
}
