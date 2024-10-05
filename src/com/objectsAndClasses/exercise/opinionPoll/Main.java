package com.objectsAndClasses.exercise.opinionPoll;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        Person[] people = new Person[lines];
        for (int i = 0; i < lines; i++) {
            String[] personInfo = scanner.nextLine().split(" ");
            String name = personInfo[0];
            int age = Integer.parseInt(personInfo[1]);
            people[i] = new Person(name, age);
        }

        Arrays.stream(people).filter(p -> p.getAge() > 30).forEach(System.out::println);
    }

}
