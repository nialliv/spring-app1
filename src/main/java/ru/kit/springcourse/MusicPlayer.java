package ru.kit.springcourse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private final ClassicalMusic classicalMusic;
    private final RockMusic rockMusic;

    @PostConstruct
    public void doMyInit() {
        System.out.println("I'm initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("I'm destroyed");
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public MusicPlayer() {
        this.classicalMusic = new ClassicalMusic();
        this.rockMusic = new RockMusic();
    }

    public void playMusic(GenreOfMusic music) {
        int index = (new Random()).nextInt(3);
        if (music == GenreOfMusic.CLASSICAL) {
            System.out.println("Playing: " + classicalMusic.getSongs().get(index));
        } else {
            System.out.println("Playing: " + rockMusic.getSongs().get(index));
        }
    }
}


