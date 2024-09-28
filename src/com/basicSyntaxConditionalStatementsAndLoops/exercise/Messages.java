package com.basicSyntaxConditionalStatementsAndLoops.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Messages {

    public static final Map<Integer, Character> NUMBER_ASSOCIATION_MAP = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        putNumberAssociations();

        int n = Integer.parseInt(reader.readLine());

        String input;

        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            input = reader.readLine();
            sb.append((char) (NUMBER_ASSOCIATION_MAP.get(Character.getNumericValue(input.charAt(0))) + input.length() - 1));
        }

        System.out.println(sb);

    }

    private static void putNumberAssociations() {
        NUMBER_ASSOCIATION_MAP.put(2, 'a');
        NUMBER_ASSOCIATION_MAP.put(3, 'd');
        NUMBER_ASSOCIATION_MAP.put(4, 'g');
        NUMBER_ASSOCIATION_MAP.put(5, 'j');
        NUMBER_ASSOCIATION_MAP.put(6, 'm');
        NUMBER_ASSOCIATION_MAP.put(7, 'p');
        NUMBER_ASSOCIATION_MAP.put(8, 't');
        NUMBER_ASSOCIATION_MAP.put(9, 'w');
        NUMBER_ASSOCIATION_MAP.put(0, ' ');
    }
}
