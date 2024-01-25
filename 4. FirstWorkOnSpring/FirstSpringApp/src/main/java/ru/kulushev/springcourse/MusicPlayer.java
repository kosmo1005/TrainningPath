package ru.kulushev.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList;
    private String name;
    private int volume;

    public MusicPlayer(Music music1, Music music2, Music music3) {
        musicList = new ArrayList<>();
        musicList.add(music1);
        musicList.add(music2);
        musicList.add(music3);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic (){
        musicList.forEach(i->{
            System.out.println(i.getSong());
        });
    }
}
