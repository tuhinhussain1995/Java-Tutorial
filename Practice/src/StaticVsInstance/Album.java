package StaticVsInstance;

import java.util.ArrayList;
import java.util.Iterator;

public class Album {
    private String name;
    private String artist;

    private ArrayList<Song> songs;



    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;

        this.songs = new ArrayList<Song>();
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }



    public void addSong(String title, double duration){
        if (findSong(title) == null){
            this.songs.add(new Song(title, duration));
        }
        else {
            System.out.println(title + " already exists in the album");
        }
    }

    private Song findSong(String title){
       for(Song currentSong : this.songs){
           if(currentSong.getTitle().equals(title)){
               return currentSong;
           }
       }
       return null;
    }

//    private boolean findSong(String title){
//        Iterator<Song> iterator = songs.iterator();
//
//        while (iterator.hasNext()){
//            Song currentSong = iterator.next();
//
//            if (title == currentSong.getTitle()){
//                return true;
//            }
//        }
//
//        return false;
//    }



}