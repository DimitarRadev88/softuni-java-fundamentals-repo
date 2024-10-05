package com.objectsAndClasses.exercise.vehicleCatalogue;

public abstract class VehicleImpl implements Vehicle {
    private String model;
    private String color;
    private int horsepower;

    protected VehicleImpl(String model, String color, int horsepower) {
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public int getHorsepower() {
        return this.horsepower;
    }

    @Override
    public String toString() {
        return String.format("Type: %s", this.getClass().getSimpleName()) +
                System.lineSeparator() +
                String.format("Model: %s", this.model) +
                System.lineSeparator() +
                String.format("Color: %s", this.color) +
                System.lineSeparator() +
                String.format("Horsepower: %d", this.horsepower);
    }
}
