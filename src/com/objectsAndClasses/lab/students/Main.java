package com.objectsAndClasses.lab.students;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Register register = new StudentRegister();
        while (!"end".equals(input)) {
            String[] info = input.split(" ");

            Student student = new Student(info[0], info[1], Integer.parseInt(info[2]), info[3]);
            if (!register.contains(student)) {
                register.add(student);
            } else {
                register.getStudent(student).setAge(student.getAge());
                register.getStudent(student).setHometown(student.getHometown());
            }

            input = scanner.nextLine();
        }

        String town = scanner.nextLine();

        register.getStudentsFromTown(town).forEach(System.out::println);
    }

}
