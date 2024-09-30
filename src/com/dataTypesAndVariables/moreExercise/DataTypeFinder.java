package com.dataTypesAndVariables.moreExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataTypeFinder {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        while (!"END".equals(input)) {
            System.out.println(getHackyInputType(input));

            input = reader.readLine();
        }
    }

    private static String getHackyInputType(String input) {
        try {
            Integer.parseInt(input);
            return input + " is integer type";
        } catch (NumberFormatException e) {
            try {
                Double.parseDouble(input);
                return input + " is floating point type";
            } catch (NumberFormatException ex) {
                if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                    return input + " is boolean type";
                } else if (input.length() == 1) {
                    return input + " is character type";
                } else {
                    return input + " is string type";
                }
            }
        }
    }

    private static String getInputType(String input) {
        Pattern integerPattern = Pattern.compile("^-?[0-9]+$");
        Matcher matcher = integerPattern.matcher(input);
        if (matcher.find()) {
            return input.concat(" is integer type");
        }

        Pattern doublePattern = Pattern.compile("^-?[0-9]+\\.[0-9]+$");
        matcher = doublePattern.matcher(input);
        if (matcher.find()) {
            return input.concat(" is floating point type");
        }

        if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
            return input.concat(" is boolean type");
        }

        if (input.length() == 1) {
            return input.concat(" is character type");
        }

        return input.concat(" is string type");
    }
}
