package com.arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        ModifiableArray array = new ModifiableArray(arr);

        String command = scanner.nextLine();

        while (!"end".equals(command)) {
            String[] split = command.split(" ");

            parseCommand(split, array);

            command = scanner.nextLine();
        }

        System.out.println(array);
    }

    private static void parseCommand(String[] split, ModifiableArray array) {
        switch (split[0]) {
            case "swap":
                array.swap(Integer.parseInt(split[1]), Integer.parseInt(split[2]));
                break;
            case "multiply":
                array.multiply(Integer.parseInt(split[1]), Integer.parseInt(split[2]));
                break;
            case "decrease":
                array.decrease();
                break;
        }
    }

    private static class ModifiableArray {
        private int[] arr;

        public ModifiableArray(int[] arr) {
            this.arr = arr;
        }

        private void decrease() {
            this.arr = Arrays.stream(arr).map(n -> n - 1).toArray();
        }

        private void multiply(int firstIndex, int secondIndex) {
            this.arr[firstIndex] = this.arr[firstIndex] * this.arr[secondIndex];
        }

        private void swap(int firstIndex, int secondIndex) {
            int temp = this.arr[firstIndex];
            this.arr[firstIndex] = this.arr[secondIndex];
            this.arr[secondIndex] = temp;
        }

        @Override
        public String toString() {
            return Arrays.stream(this.arr).mapToObj(String::valueOf).collect(Collectors.joining(", "));
        }
    }
}
