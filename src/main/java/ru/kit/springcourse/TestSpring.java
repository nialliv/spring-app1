package ru.kit.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

        boolean compare = firstMusicPlayer == secondMusicPlayer;
        System.out.println(compare);
        System.out.println(firstMusicPlayer + " " + secondMusicPlayer);
        firstMusicPlayer.setVolume(23);
        System.out.println(firstMusicPlayer.getVolume() + " " + secondMusicPlayer.getVolume());
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
