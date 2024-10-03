package com.lists.exercise;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
//        train();
//        changeList();
//        houseParty();
//        listOperations();
//        bombNumbers();
//        cardsGame();
        appendArrays();
//
    }

    private static void appendArrays() {
        List<String> arrays = Arrays.stream(SCANNER.nextLine().split("\\|")).collect(Collectors.toList());

        Collections.reverse(arrays);

        System.out.println(String.join(" ", arrays).replaceAll("\\s+", " ").trim());
    }


    private static void cardsGame() {
        List<Integer> firstDeck = getListIfNumbersFromInput();
        List<Integer> secondDeck = getListIfNumbersFromInput();

        while (!firstDeck.isEmpty() && !secondDeck.isEmpty()) {
            int firstPlayersCard = firstDeck.remove(0);
            int secondPlayersCard = secondDeck.remove(0);

            if (firstPlayersCard > secondPlayersCard) {
                firstDeck.add(firstPlayersCard);
                firstDeck.add(secondPlayersCard);
            } else if (secondPlayersCard > firstPlayersCard) {
                secondDeck.add(secondPlayersCard);
                secondDeck.add(firstPlayersCard);
            }

        }

        if (firstDeck.isEmpty()) {
            System.out.println("Second player wins! Sum: " + getSumOfNumbers(secondDeck));
        } else {
            System.out.println("First player wins! Sum: " + getSumOfNumbers(firstDeck));
        }
    }

    private static int getSumOfNumbers(List<Integer> numbers) {
        return numbers.stream().mapToInt(n -> n).sum();
    }


    private static void bombNumbers() {
        List<Integer> numbers = getListIfNumbersFromInput();

        String[] specialNumberAndPower = SCANNER.nextLine().split(" ");
        int specialNumber = Integer.parseInt(specialNumberAndPower[0]);
        int power = Integer.parseInt(specialNumberAndPower[1]);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == specialNumber) {
                int toRemove = Math.min(i + power, numbers.size() - 1) - Math.max(i - power, 0) + 1;
                removeAtListIndexNTimes(Math.max(i - power, 0), toRemove, numbers);
                i = 0;
            }
        }

        System.out.println(numbers.stream().mapToInt(n -> n).sum());
    }

    private static void removeAtListIndexNTimes(int index, int toRemove, List<Integer> numbers) {
        for (int j = 0; j < toRemove; j++) {
            numbers.remove(index);
        }
    }

    private static void listOperations() {
        List<Integer> numbers = getListIfNumbersFromInput();

        String[] input = SCANNER.nextLine().split(" ");

        while (!"End".equals(input[0])) {

            switch (input[0]) {
                case "Add" -> numbers.add(Integer.parseInt(input[1]));
                case "Insert" -> insert(numbers, input);
                case "Remove" -> removeFromList(numbers, Integer.parseInt(input[1]));
                case "Shift" -> {
                    switch (input[1]) {
                        case "left" -> shiftLeft(numbers, Integer.parseInt(input[2]));
                        case "right" -> shiftRight(numbers, Integer.parseInt(input[2]));
                    }
                }
            }

            input = SCANNER.nextLine().split(" ");
        }

        printNumbersList(numbers);
    }

    private static void insert(List<Integer> numbers, String[] input) {
        int index = Integer.parseInt(input[2]);

        if (numbers.size() >= index && index >= 0) {
            numbers.add(index, Integer.parseInt(input[1]));
        } else {
            System.out.println("Invalid index");
        }
    }

    private static void removeFromList(List<Integer> numbers, int index) {
        if (numbers.size() > index && index >= 0) {
            numbers.remove(index);
        } else {
            System.out.println("Invalid index");
        }
    }

    private static void shiftRight(List<Integer> numbers, int times) {
        for (int i = 0; i < times; i++) {
            int last = numbers.remove(numbers.size() - 1);
            numbers.add(0, last);
        }
    }

    private static void shiftLeft(List<Integer> numbers, int times) {
        for (int i = 0; i < times; i++) {
            int first = numbers.remove(0);
            numbers.add(first);
        }
    }

    private static void houseParty() {
        int inputsCount = Integer.parseInt(SCANNER.nextLine());

        List<String> people = new ArrayList<>();

        for (int i = 0; i < inputsCount; i++) {

            String[] input = SCANNER.nextLine().split(" ");
            String name = input[0];

            if (input.length == 3) {
                if (people.contains(name)) {
                    System.out.println(name + " is already in the list!");
                } else {
                    people.add(name);
                }
            } else if (people.contains(name)) {
                people.removeIf(p -> p.equals(name));
            } else {
                System.out.println(name + " is not in the list!");
            }

        }

        people.forEach(System.out::println);
    }


    private static void changeList() {
        List<Integer> numbers = getListIfNumbersFromInput();

        String[] input = SCANNER.nextLine().split(" ");

        while (!"end".equals(input[0])) {

            int element = Integer.parseInt(input[1]);

            switch (input[0]) {
                case "Delete" -> numbers.removeIf(n -> n == element);
                case "Insert" -> numbers.add(Integer.parseInt(input[2]), element);
            }

            input = SCANNER.nextLine().split(" ");
        }

        printNumbersList(numbers);

    }

    private static void train() {
        List<Integer> wagons = getListIfNumbersFromInput();

        int capacity = Integer.parseInt(SCANNER.nextLine());

        String[] input = SCANNER.nextLine().split(" ");

        while (!"end".equals(input[0])) {

            if ("Add".equals(input[0])) {
                wagons.add(Integer.parseInt(input[1]));
            } else {
                for (int i = 0; i < wagons.size(); i++) {
                    int newPassengers = Integer.parseInt(input[0]);
                    if (wagons.get(i) + newPassengers <= capacity) {
                        wagons.set(i, wagons.get(i) + newPassengers);
                        break;
                    }
                }
            }

            input = SCANNER.nextLine().split(" ");
        }

        printNumbersList(wagons);

    }

    private static void printNumbersList(List<Integer> wagons) {
        System.out.println(wagons.toString().replaceAll("[\\[\\],]", ""));
    }

    private static List<Integer> getListIfNumbersFromInput() {
        return Arrays.stream(SCANNER.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
