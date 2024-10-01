package com.dataTypesAndVariables.exercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int targetsDistance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        Pokemon pokemon = new Pokemon(pokePower, targetsDistance, exhaustionFactor);

        System.out.println(pokemon.pokeTillYouChoke());

    }

    private static class Pokemon {
        private int targets;
        private int pokePower;
        private int remainingPower;
        private int targetsDistance;
        private int exhaustionFactor;

        private Pokemon(int pokePower, int targetsDistance, int exhaustionFactor) {
            this.pokePower = pokePower;
            this.remainingPower = pokePower;
            this.targetsDistance = targetsDistance;
            this.exhaustionFactor = exhaustionFactor;
            this.targets = 0;
        }

        private boolean canPoke() {
            return this.remainingPower >= this.targetsDistance;
        }

        private String pokeTillYouChoke() {
            while (this.canPoke()) {
                this.poke();
            }

            return this.remainingPower + System.lineSeparator() + this.targets;
        }

        private void poke() {
            if (this.remainingPower >= this.targetsDistance) {
                this.remainingPower -= this.targetsDistance;

                this.targets++;

                if (shouldDrasticallyReducePower()) {
                    this.remainingPower /= this.exhaustionFactor;
                }
            }

        }

        private boolean shouldDrasticallyReducePower() {
            return this.remainingPower > 0 && this.pokePower % this.remainingPower == 0
                    && this.pokePower / this.remainingPower == 2 && this.exhaustionFactor > 0;
        }
    }
}
