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

    public static class Person {
        private String name;
        private String id;
        private int age;

        public Person(String name, String id, int age) {
            setName(name);
            setId(id);
            setAge(age);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.", this.name, this.id, this.age);
        }
    }
}
