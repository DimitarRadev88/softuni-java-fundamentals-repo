package com.associativeArraysLambdaAndStreamAPI.lab;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
//        countRealNumbers();
//        wordSynonyms();
//        oddOccurrences();
        wordFilter();
    }

    private static void wordFilter() {
        Arrays.stream(SCANNER.nextLine().split(" "))
                .filter(w -> w.length() % 2 == 0)
                .forEach(System.out::println);
    }


    private static void oddOccurrences() {
        Map<String, Integer> wordOccurrencesMap = new LinkedHashMap<>();

        Arrays.stream(SCANNER.nextLine().split(" ")).forEach(w -> {
            wordOccurrencesMap.putIfAbsent(w.toLowerCase(), 0);
            wordOccurrencesMap.put(w.toLowerCase(), wordOccurrencesMap.get(w.toLowerCase()) + 1);
        });

        System.out.println(wordOccurrencesMap
                .entrySet()
                .stream()
                .filter(e -> e.getValue() % 2 != 0)
                .map(Map.Entry::getKey)
                .collect(Collectors.joining(", ")));
    }


    private static void wordSynonyms() {
        Map<String, List<String>> wordSynonymsMap = new LinkedHashMap<>();

        IntStream.range(0, Integer.parseInt(SCANNER.nextLine()))
                .forEach(n -> {
                    String word = SCANNER.nextLine();
                    wordSynonymsMap.putIfAbsent(word, new ArrayList<>());
                    wordSynonymsMap.get(word).add(SCANNER.nextLine());
                });

        wordSynonymsMap.forEach((k, v) -> System.out.println(k + " - " + String.join(", ", v)));

    }

    private static void countRealNumbers() {
        Map<Double, Integer> numbersOccurrencesMap = new TreeMap<>();

        Arrays.stream(SCANNER.nextLine().split(" ")).map(Double::parseDouble).forEach(n -> {
            numbersOccurrencesMap.putIfAbsent(n, 0);
            numbersOccurrencesMap.put(n, numbersOccurrencesMap.get(n) + 1);
        });

        numbersOccurrencesMap.forEach((k, v) -> System.out.println(
                new DecimalFormat("#.####").format(k) + " -> " + v)
        );
    }
}
