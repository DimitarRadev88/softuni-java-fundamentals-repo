package com.associativeArraysLambdaAndStreamAPI.excercise;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
//        countCharsInAString();
//        aMinerTask();
//        orders();
//        softUniParking();
//        courses();
//        studentAcademy();
//        legendaryFarming();
            companyUsers();
        }

    private static void companyUsers() {
        String input = SCANNER.nextLine();

        Map<String, Set<String>> companyEmployeesMap = new LinkedHashMap<>();
        while (!"End".equals(input)) {
            String[] companyEmployee = input.split(" -> ");

            companyEmployeesMap.putIfAbsent(companyEmployee[0], new LinkedHashSet<>());
            companyEmployeesMap.get(companyEmployee[0]).add(companyEmployee[1]);

            input = SCANNER.nextLine();
        }

        companyEmployeesMap.forEach((k, v) ->
                System.out.println(k + System.lineSeparator() +
                        v.stream().map(e -> "-- " + e).collect(Collectors.joining(System.lineSeparator()))));
    }


    private static void legendaryFarming() {


        Map<String, Integer> materialsCountMap = new LinkedHashMap<>();
                materialsCountMap.put("shards", 0);
                materialsCountMap.put("fragments", 0);
                materialsCountMap.put("motes", 0);

        Map<String, String> materialItemMap = new HashMap<>(Map.of(
                "shards", "Shadowmourne",
                "fragments", "Valanyr",
                "motes", "Dragonwrath"
        ));

        boolean itemIsCreated = false;
        while (!itemIsCreated) {
            String[] input = SCANNER.nextLine().split(" ");

            for (int i = 0; i < input.length; i += 2) {
                int count = Integer.parseInt(input[i]);
                String material = input[i + 1].toLowerCase();

                materialsCountMap.putIfAbsent(material, 0);
                materialsCountMap.put(material, materialsCountMap.get(material) + count);

                if (materialItemMap.containsKey(material) && materialsCountMap.get(material) >= 250) {
                    System.out.println(materialItemMap.get(material) + " obtained!");
                    materialsCountMap.put(material, materialsCountMap.get(material) - 250);
                    itemIsCreated = true;
                    break;
                }
            }

        }

        materialsCountMap.forEach((k, v) -> System.out.println(k + ": " + v));
    }


    private static void studentAcademy() {
        Map<String, List<Double>> studentsGradesMap = new LinkedHashMap<>();
        IntStream.range(0, Integer.parseInt(SCANNER.nextLine())).forEach(l -> {
            String student = SCANNER.nextLine();
            studentsGradesMap.putIfAbsent(student, new ArrayList<>());
            studentsGradesMap.get(student).add(Double.parseDouble(SCANNER.nextLine()));
        });

        studentsGradesMap.entrySet().stream()
                .map(e -> Map.entry(e.getKey(), e.getValue().stream().mapToDouble(n -> n).sum() / e.getValue().size()))
                .filter(e -> e.getValue() >= 4.5).forEach(e -> System.out.printf("%s -> %.2f%n", e.getKey(), e.getValue()));
    }


    private static void courses() {
        String input = SCANNER.nextLine();

        Map<String, List<String>> coursesRegisteredStudentsMap = new LinkedHashMap<>();
        while (!"end".equals(input)) {
            String[] courseInfo = input.split(" : ");

            coursesRegisteredStudentsMap.putIfAbsent(courseInfo[0], new ArrayList<>());
            coursesRegisteredStudentsMap.get(courseInfo[0]).add(courseInfo[1]);

            input = SCANNER.nextLine();
        }

        printCourseInfo(coursesRegisteredStudentsMap);
    }

    private static void printCourseInfo(Map<String, List<String>> coursesRegisteredStudentsMap) {
        coursesRegisteredStudentsMap.forEach((k, v) ->
                System.out.println(
                        k + ": " + v.size() +
                                System.lineSeparator() +
                                v.stream()
                                        .map(n -> "-- " + n)
                                        .collect(Collectors.joining(System.lineSeparator()))
                )
        );
    }

    private static void softUniParking() {
        Map<String, String> ownerRegistrationMap = new LinkedHashMap<>();

        IntStream.range(0, Integer.parseInt(SCANNER.nextLine())).forEach(l -> {
            try {
                System.out.println(parseInput(ownerRegistrationMap));
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        });

        ownerRegistrationMap.forEach((k, v) -> System.out.println(k + " => " + v));
    }

    private static String parseInput(Map<String, String> ownerRegistrationMap) {
        String output;
        String[] input = SCANNER.nextLine().split(" ");
        switch (input[0]) {
            case "register" -> {
                output = register(ownerRegistrationMap, input);
            }
            case "unregister" -> {
                output = unregister(ownerRegistrationMap, input);
            }
            default -> throw new UnsupportedOperationException();
        }
        return output;
    }

    private static String register(Map<String, String> ownerRegistrationMap, String[] input) {
        String output;
        if (ownerRegistrationMap.containsKey(input[1])) {
            throw new IllegalStateException(String.format("ERROR: already registered with plate number %s",
                    ownerRegistrationMap.get(input[1])));
        } else {
            ownerRegistrationMap.put(input[1], input[2]);
            output = String.format("%s registered %s successfully", input[1], input[2]);
        }
        return output;
    }

    private static String unregister(Map<String, String> ownerRegistrationMap, String[] input) {
        String output;
        if (!ownerRegistrationMap.containsKey(input[1])) {
            throw new IllegalStateException(String.format("ERROR: user %s not found", input[1]));
        } else {
            ownerRegistrationMap.remove(input[1]);
            output = String.format("%s unregistered successfully", input[1]);
        }
        return output;
    }

    private static void orders() {
        String input = SCANNER.nextLine();

        Map<String, Double> productsPricesMap = new LinkedHashMap<>();
        Map<String, Integer> productsQuantityMap = new LinkedHashMap<>();
        while (!"buy".equals(input)) {
            String[] productInfo = input.split(" ");

            productsPricesMap.put(productInfo[0], Double.parseDouble(productInfo[1]));
            productsQuantityMap.putIfAbsent(productInfo[0], 0);
            productsQuantityMap.put(productInfo[0], productsQuantityMap.get(productInfo[0]) + Integer.parseInt(productInfo[2]));

            input = SCANNER.nextLine();
        }

        productsPricesMap.forEach((k, v) -> System.out.printf("%s -> %.2f%n", k, v * productsQuantityMap.get(k)));
    }

    private static void aMinerTask() {
        String input = SCANNER.nextLine();

        Map<String, Integer> resourcesQuantityMap = new LinkedHashMap<>();
        while (!"stop".equals(input)) {
            int quantity = Integer.parseInt(SCANNER.nextLine());
            resourcesQuantityMap.putIfAbsent(input, 0);
            resourcesQuantityMap.put(input, resourcesQuantityMap.get(input) + quantity);

            input = SCANNER.nextLine();
        }

        resourcesQuantityMap.forEach((k, v) -> System.out.println(k + " -> " + v));
    }


    private static void countCharsInAString() {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        char[] text = SCANNER.nextLine().replaceAll(" ", "").toCharArray();

        for (char c : text) {
            charCountMap.putIfAbsent(c, 0);
            charCountMap.put(c, charCountMap.get(c) + 1);
        }

        charCountMap.forEach((k, v) -> System.out.println(k + " -> " + v));

    }
}
