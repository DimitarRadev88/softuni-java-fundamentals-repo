package com.objectsAndClasses.exercise.students;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        Student[] students = new Student[lines];
        for (int i = 0; i < lines; i++) {
            String[] studentInfo = scanner.nextLine().split(" ");
            students[i] = new Student(studentInfo[0], studentInfo[1], Double.parseDouble(studentInfo[2]));
        }

        Arrays.stream(students).sorted(Comparator.comparing(Student::getGrade).reversed()).forEach(System.out::println);

    }

    public static class Student {
        private String firstName;
        private String secondName;
        private double grade;

        public Student(String firstName, String secondName, double grade) {
            setFirstName(firstName);
            setSecondName(secondName);
            setGrade(grade);
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getSecondName() {
            return secondName;
        }

        public void setSecondName(String secondName) {
            this.secondName = secondName;
        }

        public double getGrade() {
            return grade;
        }

        public void setGrade(double grade) {
            this.grade = grade;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f", this.firstName, this.secondName, this.grade);
        }
    }

}
