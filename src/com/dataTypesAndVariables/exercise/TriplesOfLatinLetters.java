package com.dataTypesAndVariables.exercise;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {

        char start = 'a';
        char end = (char) (start + new Scanner(System.in).nextInt());

        for (char i = start; i < end; i++) {
            for (char j = start; j < end; j++) {
                for (char k = start; k < end; k++) {
                    System.out.println("" + i + j + k);
                }
            }
        }
    }


}
