package ru.kulushev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer player = context.getBean("musicPlayerBean", MusicPlayer.class);
        player.playMusic();
        System.out.println(player.getName());
        System.out.println(player.getVolume());
        context.close();
    }
}
