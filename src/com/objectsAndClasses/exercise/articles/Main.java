package com.objectsAndClasses.exercise.articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] info = scanner.nextLine().split(", ");

        Article article = new Article(info[0], info[1], info[2]);

        int commands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < commands; i++) {
            parserInputCommand(scanner, article);
        }

        System.out.println(article);
    }

    private static void parserInputCommand(Scanner scanner, Article article) {
        String[] input = scanner.nextLine().split(": ");
        switch (input[0]) {
            case "Edit":
                article.edit(input[1]);
                break;
            case "ChangeAuthor":
                article.changeAuthor(input[1]);
                break;
            case "Rename":
                article.rename(input[1]);
                break;
        }
    }
}
