package ru.kit.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("rockMusicBean")
public class RockMusic implements Music {
    private final List<String> tracks = new ArrayList<>();

    {
        tracks.add("Smells Like Teen Spirit");
        tracks.add("Smoke on the Water");
        tracks.add("Kashmir");

    }

    @Override
    public List<String> getSongs() {
        return tracks;
    }
}
