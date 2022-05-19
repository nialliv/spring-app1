package ru.kit.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("classicalMusicBean")
public class ClassicalMusic implements Music {
    private final List<String> tracks = new ArrayList<>();

    {
        tracks.add("Eine kleine Nachtmusik. Ahmed Barod");
        tracks.add("The Four Seasons");
        tracks.add("Carmen");
    }

    @Override
    public List<String> getSongs() {
        return tracks;
    }
}
