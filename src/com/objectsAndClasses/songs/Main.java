package com.objectsAndClasses.songs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Songs songs = new SongsList();

        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            String[] songInfo = scanner.nextLine().split("_");
            songs.add(new Song(songInfo[0], songInfo[1], songInfo[2]));
        }

        String type = scanner.nextLine();

        songs.getSongNamesByType(type).forEach(System.out::println);
    }

}
