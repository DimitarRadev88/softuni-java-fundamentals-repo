package com.objectsAndClasses.songs;

import java.util.List;

public interface Songs {

    List<String> getSongNamesByType(String type);

    void add(Song song);
}
