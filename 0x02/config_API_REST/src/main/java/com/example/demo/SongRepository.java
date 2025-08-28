package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SongRepository {

    private List<Song> list = new ArrayList<>();

    public List<Song> getAllSongs(){
        return list;
    }

    public Song getSongById(Integer id){
        Song song = null;
        for(Song s : list){
            if(s.getId() == id){
                song = s;
            }
        }
        return song;
    }


}
