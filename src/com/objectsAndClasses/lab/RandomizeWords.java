package com.objectsAndClasses.lab;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        String[] words = new Scanner(System.in).nextLine().split(" ");

        Random random = new Random(0);

        boolean[] used = new boolean[words.length];
        for (int i = 0; i < words.length; i++) {
            while (true) {
                int index = random.nextInt(words.length);
                if (!used[index]) {
                    used[index] = true;
                    System.out.println(words[index]);
                    break;
                }
            }

        }
    }
}
