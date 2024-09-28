package com.basicSyntaxConditionalStatementsAndLoops.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeAfterThirtyMinutes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int hours = Integer.parseInt(reader.readLine());
        int minutes = Integer.parseInt(reader.readLine());

        System.out.println(getFormattedTimeAfter30Min(hours, minutes));
    }

    private static String getFormattedTimeAfter30Min(int hours, int minutes) {
        minutes += 30;

        if (minutes > 59) {
            minutes -= 60;
            hours += 1;
        }

        if (hours == 24) {
            hours = 0;
        }

        return String.format("%d:%02d", hours, minutes);
    }
}
