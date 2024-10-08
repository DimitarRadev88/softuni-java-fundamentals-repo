package com.regularExpressions.exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
//        furniture();
        softUniBarIncome();
    }

    private static void softUniBarIncome() {
        Pattern pattern = Pattern.compile("%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<product>[\\w]+)>[^|$%.]*\\|(?<quantity>\\d+)\\|[^|$%.\\d]*(?<price>\\d+.?\\d*)\\$");
        String input = SCANNER.nextLine();
        Matcher matcher;

        double totalIncome = 0;
        while (!input.equals("end of shift")) {
            matcher = pattern.matcher(input);

            while (matcher.find()) {
                String name = matcher.group("name");
                String product = matcher.group("product");
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double price = Double.parseDouble(matcher.group("price"));
                System.out.printf("%s: %s - %.2f%n", name, product, quantity * price);
                totalIncome += quantity * price;
            }

            input = SCANNER.nextLine();
        }

        System.out.printf("Total income: %.2f", totalIncome);
    }

    private static void furniture() {
        String input = SCANNER.nextLine();

        Pattern pattern = Pattern.compile(">>(?<furniture>[A-Za-z]+)<<(?<price>\\d+.?\\d*)!(?<quantity>\\d+)");
        Matcher matcher;
        List<String> furnitureList = new ArrayList<>();
        double total = 0;
        while (!"Purchase".equals(input)) {
            matcher = pattern.matcher(input);

            while (matcher.find()) {
                String furniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                furnitureList.add(furniture);
                total += price * quantity;
            }

            input = SCANNER.nextLine();
        }

        System.out.println("Bought furniture:");

        furnitureList.forEach(System.out::println);

        System.out.printf("Total money spend: %.2f", total);

    }
}
