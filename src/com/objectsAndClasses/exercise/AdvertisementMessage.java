package com.objectsAndClasses.exercise;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {

    private static final String[] PHRASES = {
            "Excellent product.", "Such a great product.",
            "I always use that product.", "Best product of its category.",
            "Exceptional product.", "I can’t live without this product."
    };

    private static final String[] EVENTS = {
            "Now I feel good.", "I have succeeded with this product.",
            "Makes miracles. I am happy of the results!",
            "I cannot believe but now I feel awesome.",
            "Try it yourself, I am very satisfied.", "I feel great!"
    };

    private static final String[] AUTHORS = {
            "Diana", "Petya", "Stella", "Elena",
            "Katya", "Iva", "Annie", "Eva"
    };

    private static final String[] CITIES = {
            "Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int messagesCount = scanner.nextInt();

        for (int i = 0; i < messagesCount; i++) {
            System.out.println(generateAdvertisementMessage());
        }
    }

    private static String generateAdvertisementMessage() {
        Random random = new Random();

        return String.format("%s %s %s - %s",
                PHRASES[random.nextInt(PHRASES.length)],
                EVENTS[random.nextInt(EVENTS.length)],
                AUTHORS[random.nextInt(AUTHORS.length)],
                CITIES[random.nextInt(CITIES.length)]
        );
    }
}
