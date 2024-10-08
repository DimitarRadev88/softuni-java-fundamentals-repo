package com.regularExpressions.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
//        matchFullName();
//        matchPhoneNumber();
        matchDates();
    }

    private static void matchDates() {
        Pattern pattern = Pattern.compile("\\b(?<day>\\d{2})([/.-])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b");
        Matcher matcher = pattern.matcher(SCANNER.nextLine());

        while (matcher.find()) {
            String day = matcher.group("day");
            String month = matcher.group("month");
            String year = matcher.group("year");

            System.out.printf("Day: %s, Month: %s, Year: %s%n", day, month, year);
        }
    }

    private static void matchPhoneNumber() {
        Pattern pattern = Pattern.compile("\\+359([ -])2\\1\\d{3}\\1\\d{4}\\b");
        Matcher matcher = pattern.matcher(SCANNER.nextLine());

        List<String> matchedNumbers = new ArrayList<>();
        while (matcher.find()) {
            matchedNumbers.add(matcher.group());
        }

        System.out.println(String.join(", ", matchedNumbers));
    }

    private static void matchFullName() {
        String input = SCANNER.nextLine();

        Pattern pattern = Pattern.compile("\\b[A-Z][a-z]+ [A-Z][a-z]+\\b");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}
