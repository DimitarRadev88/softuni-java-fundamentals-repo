package com.dataTypesAndVariables.lab;

import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TownInfo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Town town = getTownFromInput(scanner);

        System.out.println(town);
    }

    private static Town getTownFromInput(Scanner scanner) throws IOException {
        String[] array = IntStream.range(0, 3).mapToObj(n -> scanner.nextLine()).toArray(String[]::new);

        return new Town(array[0], array[1], array[2]);
    }

    private static class Town {
        private String name;
        private String population;
        private String area;

        public Town(String name, String population, String area) {
            this.name = name;
            this.population = population;
            this.area = area;
        }

        @Override
        public String toString() {
            return String.format("Town %s has population of %s and area %s square km.", name, population, area);
        }
    }
}
