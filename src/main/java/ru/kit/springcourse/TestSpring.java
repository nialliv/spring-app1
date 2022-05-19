package ru.kit.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer p = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer p2 = context.getBean("musicPlayer", MusicPlayer.class);

        p.playMusic(GenreOfMusic.CLASSICAL);
        p.playMusic(GenreOfMusic.ROCK);
        System.out.println(p.getName());
        System.out.println(p.getVolume());

        context.close();
    }
}
