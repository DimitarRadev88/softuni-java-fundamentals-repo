package com.basicSyntaxConditionalStatementsAndLoops.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ForeignLanguages {

    private static final Set<String> ENGLISH_SPEAKING_COUNTRIES = Set.of("England", "USA");
    private static final Set<String> SPANISH_SPEAKING_COUNTRIES = Set.of("Spain", "Argentina", "Mexico");

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String country = reader.readLine();

        System.out.println(getNativeLanguage(country));
    }

    private static String getNativeLanguage(String country) {
        return ENGLISH_SPEAKING_COUNTRIES.contains(country) ?
                "English" :
                SPANISH_SPEAKING_COUNTRIES.contains(country) ?
                "Spanish" : "unknown";
    }
}
