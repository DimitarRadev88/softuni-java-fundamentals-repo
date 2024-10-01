package com.dataTypesAndVariables.exercise;

import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println(IntStream.range(0, Integer.parseInt(scanner.nextLine()))
                .mapToObj(n -> new SnowBall(
                        Integer.parseInt(scanner.nextLine()),
                        Integer.parseInt(scanner.nextLine()),
                        Integer.parseInt(scanner.nextLine())
                )).max(Comparator.comparingDouble(SnowBall::getValue)).get());
    }

    private static class SnowBall {
        private int snow;
        private int time;
        private int quality;
        private double value;

        public SnowBall(int snow, int time, int quality) {
            this.snow = snow;
            this.time = time;
            this.quality = quality;
            this.value = Math.pow(this.snow / this.time, quality);
        }

        private double getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.format("%d : %d = %.0f (%d)", this.snow, this.time, this.value, this.quality);
        }
    }
}
