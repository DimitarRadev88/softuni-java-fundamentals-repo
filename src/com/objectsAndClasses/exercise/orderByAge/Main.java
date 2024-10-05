package com.objectsAndClasses.exercise.orderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Person> personList = new ArrayList<>();
        while (!"End".equals(input)) {
            String[] info = input.split(" ");

            personList.add(new Person(info[0], info[1], Integer.parseInt(info[2])));

            input = scanner.nextLine();
        }

        printOrderedByAge(personList);
    }

    private static void printOrderedByAge(List<Person> personList) {
        personList.stream().sorted(Comparator.comparingInt(Person::getAge)).forEach(System.out::println);
    }

}
