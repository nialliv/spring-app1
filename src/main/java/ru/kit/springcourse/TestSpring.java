package ru.kit.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music rockMusic= context.getBean("rockMusicBean", Music.class);
        Music classicalMusic = context.getBean("classicalMusicBean", Music.class);
        MusicPlayer p = new MusicPlayer(rockMusic);
        MusicPlayer p2 = new MusicPlayer(classicalMusic);

        p.playMusic();
        p2.playMusic();
        context.close();
    }
}
