package com.objectsAndClasses.exercise.vehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        VehicleCatalogue vehicles = new VehicleCatalogue();
        while (!"End".equals(input)) {
            String[] vehicleInfo = input.split(" ");

            vehicles.add(createVehicle(vehicleInfo));

            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!"Close the Catalogue".equals(input)) {
            System.out.println(vehicles.getVehicle(input));
            input = scanner.nextLine();
        }

        System.out.println(vehicles);

    }

    private static Vehicle createVehicle(String[] vehicleInfo) {
        return switch (vehicleInfo[0]) {
            case "car":
                yield new Car(vehicleInfo[1], vehicleInfo[2], Integer.parseInt(vehicleInfo[3]));
            case "truck":
                yield new Truck(vehicleInfo[1], vehicleInfo[2], Integer.parseInt(vehicleInfo[3]));
            default:
                throw new IllegalArgumentException();
        };
    }

}
