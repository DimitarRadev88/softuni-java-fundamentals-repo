package com.arrays.exercise;

import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Set<String> stringSet = new HashSet<>(Set.of(scanner.nextLine().split(" ")));
//
//        stringSet.retainAll(Set.of(scanner.nextLine().split(" ")));
//
//        System.out.println(String.join(" ", stringSet));

        String[] first = scanner.nextLine().split(" ");
        String[] second = scanner.nextLine().split(" ");

        for (String str : second) {
            if (contains(first, str)) {
                System.out.print(str + " ");
            }
        }

    }

    private static boolean contains(String[] array, String element) {
        String[] copy = Arrays.copyOf(array, array.length);
        Arrays.sort(copy);
        return Arrays.binarySearch(copy, element) >= 0;
    }
}
