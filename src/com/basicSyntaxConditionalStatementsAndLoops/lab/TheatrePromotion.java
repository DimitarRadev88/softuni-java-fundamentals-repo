package com.basicSyntaxConditionalStatementsAndLoops.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;

public class TheatrePromotion {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String dayType = reader.readLine();
        int age = Integer.parseInt(reader.readLine());

        try {
            System.out.println(getTicketPrice(dayType, age) + "$");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int getTicketPrice(String dayType, int age) {
        validateAge(age);

        switch (dayType) {
            case "Weekday": return age <= 18 || age > 64 ? 12 : 18;
            case "Weekend": return age <= 18 || age > 64 ? 15 : 20;
            case "Holiday": return age <= 18 ? 5 : age <= 64 ? 12 : 10;
            default: return 0;
        }

    }

    private static void validateAge(int age) {
        if (age < 0 || age > 122) {
            throw new IllegalArgumentException("Error!");
        }
    }
}
