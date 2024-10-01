package com.dataTypesAndVariables.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpiceMustFlow {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int startingYield = Integer.parseInt(reader.readLine());

        Mine mine = new Mine(startingYield);

        while (mine.canBeMined()) {
            mine.extract();
            mine.feedCrew();
        }

        mine.feedCrew();

        System.out.println(mine);

    }

    private static class Mine {
        private int yield;
        private int storage;
        private int workingDays;

        private Mine(int yield) {
            this.yield = yield;
            this.storage = 0;
            this.workingDays = 0;
        }

        private void extract() {
            this.storage += yield;
            this.yield -= 10;
            workingDays++;
        }

        private boolean canBeMined() {
            return yield >= 100;
        }

        private void feedCrew() {
            this.storage -= Math.min(storage, 26);
        }

        @Override
        public String toString() {
            return this.workingDays + System.lineSeparator() + storage;
        }
    }
}
