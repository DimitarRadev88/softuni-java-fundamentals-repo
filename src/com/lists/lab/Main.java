package com.lists.lab;

import java.text.DecimalFormat;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
//        sumAdjacentEqualNumbers();
//        gaussTrick();
//        mergingLists();
//        listManipulationBasics();
//        listManipulationAdvanced();
//        listOfProducts();

        removeNegativesAndReverse();
    }

    private static void removeNegativesAndReverse() {
        List<Integer> numbers = getReadNumbersFromConsole();

        numbers.removeIf(n -> n < 0);

        if (!numbers.isEmpty()) {
            for (int i = numbers.size() - 1; i >= 0; i--) {
                System.out.print(numbers.get(i) + " ");
            }
        } else {
            System.out.println("empty");
        }
    }


    private static void listOfProducts() {
        List<String> products = IntStream
                .range(0, Integer.parseInt(SCANNER.nextLine()))
                .mapToObj(n -> SCANNER.nextLine()).sorted().collect(Collectors.toList());

        for (int i = 0; i < products.size(); i++) {
            System.out.println(i + 1 + "." + products.get(i));
        }

    }


    private static void listManipulationAdvanced() {
        List<Integer> numbers = getReadNumbersFromConsole();

        String[] input = SCANNER.nextLine().split(" ");

        while (!"end".equals(input[0])) {
            String output = switch (input[0]) {
                case "Contains":
                    yield numbers.contains(Integer.parseInt(input[1])) ? "Yes" : "No such number";
                case "Print":
                    yield input[1].equals("even") ?
                            getListAsString(getFilteredList(numbers, n -> n % 2 == 0)) :
                            getListAsString(getFilteredList(numbers, n -> n % 2 != 0));
                case "Get":
                    yield String.valueOf(numbers.stream().mapToInt(n -> n).sum());
                case "Filter":
                    yield getListAsString(getFilteredList(numbers, getFilter(input[1], Integer.parseInt(input[2]))));
                default:
                    throw new UnsupportedOperationException();
            };

            System.out.println(output);

            input = SCANNER.nextLine().split(" ");
        }

    }

    private static Predicate<Integer> getFilter(String condition, int number) {
        return switch (condition) {
            case ">":
                yield n -> n > number;
            case "<":
                yield n -> n < number;
            case ">=":
                yield n -> n >= number;
            case "<=":
                yield n -> n <= number;
            default:
                throw new UnsupportedOperationException();
        };
    }

    private static String getListAsString(List<Integer> numbers) {
        return numbers.toString().replaceAll("[\\[\\],]", "");
    }

    private static List<Integer> getFilteredList(List<Integer> numbers, Predicate<Integer> filter) {
        return numbers.stream().filter(filter::test)
                .collect(Collectors.toList());
    }


    private static void listManipulationBasics() {
        List<Integer> numbers = getReadNumbersFromConsole();

        String[] input = SCANNER.nextLine().split(" ");

        while (!"end".equals(input[0])) {
            switch (input[0]) {
                case "Add":
                    numbers.add(Integer.parseInt(input[1]));
                    break;
                case "Remove":
                    int toRemove = Integer.parseInt(input[1]);
                    numbers.remove(toRemove);
                    break;
                case "RemoveAt":
                    numbers.remove(Integer.parseInt(input[1]));
                    break;
                case "Insert":
                    numbers.add(Integer.parseInt(input[2]), Integer.parseInt(input[1]));
                    break;
            }

            input = SCANNER.nextLine().split(" ");
        }

        numbers.forEach(n -> System.out.print(n + " "));
    }

    private static void mergingLists() {
        List<Integer> first = getReadNumbersFromConsole();
        List<Integer> second = getReadNumbersFromConsole();

        List<Integer> merged = new ArrayList<>();
        for (int i = 0; i < first.size() && i < second.size(); i++) {
            merged.add(first.get(i));
            merged.add(second.get(i));
        }

        if (first.size() > second.size()) {
            merged.addAll(first.subList(second.size(), first.size()));
        } else if (first.size() < second.size()) {
            merged.addAll(second.subList(first.size(), second.size()));
        }

        merged.forEach(n -> System.out.print(n + " "));
    }

    private static List<Integer> getReadNumbersFromConsole() {
        return Arrays.stream(SCANNER.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
    }

    private static void gaussTrick() {
        List<Integer> numbers = getReadNumbersFromConsole();

        List<Integer> summedNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size() / 2; i++) {
            summedNumbers.add(numbers.get(i) + numbers.get(numbers.size() - i - 1));
        }

        if (numbers.size() % 2 != 0) {
            summedNumbers.add(numbers.get(numbers.size() / 2));
        }

        summedNumbers.forEach(n -> System.out.print(n + " "));
    }


    private static void sumAdjacentEqualNumbers() {
        List<Double> numbers = Arrays.stream(SCANNER.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < numbers.size() - 1; i++) {
            double first = numbers.get(i);
            double second = numbers.get(i + 1);
            if (first == second) {
                numbers.set(i, first + second);
                numbers.remove(i + 1);
                i = -1;
            }
        }

        numbers.forEach(n -> System.out.print(new DecimalFormat("#.####").format(n) + " "));
    }

}
