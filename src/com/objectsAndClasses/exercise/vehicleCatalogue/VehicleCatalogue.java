package com.objectsAndClasses.exercise.vehicleCatalogue;

import java.util.ArrayList;
import java.util.List;

public class VehicleCatalogue implements Catalogue {
    private List<Vehicle> cars;
    private List<Vehicle> trucks;

    public VehicleCatalogue() {
        this.cars = new ArrayList<>();
        this.trucks = new ArrayList<>();
    }

    @Override
    public void add(Vehicle vehicle) {
        if (vehicle.getClass().getSimpleName().equals("Car")) {
            cars.add(vehicle);
        } else {
            trucks.add(vehicle);
        }

    }

    @Override
    public Vehicle getVehicle(String model) {
        return this.cars.stream()
                .filter(v -> v.getModel().equals(model))
                .findFirst()
                .orElse(
                        this.trucks.stream()
                                .filter(v -> v.getModel().equals(model))
                                .findFirst().orElse(null)
                );

    }

    @Override
    public String toString() {
        return String.format("Cars have average horsepower of: %.2f.",
                getCarsAverageHorsepower()) +
                System.lineSeparator() +
                String.format("Trucks have average horsepower of: %.2f.",
                        getTrucksAverageHorsepower());
    }

    private double getTrucksAverageHorsepower() {
        if (!trucks.isEmpty()) {

            return this.trucks.stream().mapToInt(Vehicle::getHorsepower).sum() * 1.00 / trucks.size();
        }

        return 0.00;
    }

    private double getCarsAverageHorsepower() {
        if (!cars.isEmpty()) {
            return this.cars.stream().mapToInt(Vehicle::getHorsepower).sum() * 1.00 / cars.size();
        }

        return 0.00;
    }
}
