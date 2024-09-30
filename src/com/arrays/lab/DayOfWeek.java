package com.arrays.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOfWeek {
    private static final String[] DAYS_OF_WEEK_ARR = {
            "Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday"
    };

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int dayNumber = Integer.parseInt(reader.readLine());

        try {
            printDayOfWeek(dayNumber);
        } catch (InvalidDayOfWeekException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void printDayOfWeek(int dayNumber) {
        if (dayNumber <= 0 || dayNumber > DAYS_OF_WEEK_ARR.length) {
            throw new InvalidDayOfWeekException("Invalid day!");
        }

        System.out.println(DAYS_OF_WEEK_ARR[dayNumber - 1]);
    }

    private static class InvalidDayOfWeekException extends IllegalArgumentException {
        public InvalidDayOfWeekException(String message) {
            super(message);
        }
    }
}
