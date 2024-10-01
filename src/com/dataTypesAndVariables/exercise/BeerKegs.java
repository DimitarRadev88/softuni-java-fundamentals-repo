package com.dataTypesAndVariables.exercise;

import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class BeerKegs {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner((System.in));

        System.out.println(IntStream.range(0, Integer.parseInt(scanner.nextLine()))
                .mapToObj(n -> new Keg(
                        scanner.nextLine(),
                        Double.parseDouble(scanner.nextLine()),
                        Double.parseDouble(scanner.nextLine()))
                )
                .max(Comparator.comparingDouble(keg -> keg.volume))
                .get().name);

    }

    private static class Keg {
        private String name;
        private double volume;

        public Keg(String name, double radius, double height) {
            this.name = name;
            this.volume = Math.PI * Math.pow(radius, 2) * height;
        }
    }
}
