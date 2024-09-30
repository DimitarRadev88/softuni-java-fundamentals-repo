package com.basicSyntaxConditionalStatementsAndLoops.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RageExpenses {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int lostGames = Integer.parseInt(reader.readLine());
        double headsetPrice = Double.parseDouble(reader.readLine());
        double mousePrice = Double.parseDouble(reader.readLine());
        double keyboardPrice = Double.parseDouble(reader.readLine());
        double displayPrice = Double.parseDouble(reader.readLine());

        int headsets = lostGames / 2;
        int mice = lostGames / 3;
        int keyboards = lostGames / 6;
        int displays = lostGames / 12;

        double total = headsets * headsetPrice + mice * mousePrice + keyboards * keyboardPrice + displays * displayPrice;
        System.out.printf("Rage expenses: %.2f lv.",total);
    }
}
