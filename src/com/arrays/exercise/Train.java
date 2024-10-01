package com.arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String people = IntStream.range(0, Integer.parseInt(scanner.nextLine()))
                .mapToObj(n -> scanner.nextLine()).collect(Collectors.joining(" "));

        System.out.println(people);
        System.out.println(Arrays.stream(people.split(" ")).mapToInt(Integer::parseInt).sum());
    }
}
