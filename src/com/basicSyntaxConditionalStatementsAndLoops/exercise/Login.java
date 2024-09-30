package com.basicSyntaxConditionalStatementsAndLoops.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Login {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String username = reader.readLine();

        String password = new StringBuilder(username).reverse().toString();

        String input = reader.readLine();

        int tries = 1;
        while (!password.equals(input)) {
            if (tries == 4) {
                System.out.println("User " + username + " blocked!");
                return;
            }
            System.out.println("Incorrect password. Try again.");

            input = reader.readLine();
            tries++;
        }


        System.out.println("User " + username + " logged in.");


    }
}
