package com.objectsAndClasses.songs;

import java.util.ArrayList;
import java.util.List;

public class SongsList implements Songs {

    private List<Song> songsList;

    public SongsList() {
        this.songsList = new ArrayList<>();
    }

    @Override
    public List<String> getSongNamesByType(String type) {
        if (type.equals("all")) {
            return songsList.stream().map(Song::getName).toList();
        }
        return this.songsList.stream().filter(song -> song.getTypeList().equals(type)).map(Song::getName).toList();
    }

    @Override
    public void add(Song song) {
        this.songsList.add(song);
    }
}
