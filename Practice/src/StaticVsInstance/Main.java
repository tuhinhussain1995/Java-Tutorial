package StaticVsInstance;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

class Main{

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album myAlbum1 = new Album("Stormbringer", "Deep Purple");

        myAlbum1.addSong("Stormbringer", 4.6);
        myAlbum1.addSong("Love don't mean a thing", 4.22);
        myAlbum1.addSong("Holy man", 4.3);
        myAlbum1.addSong("Hold on", 5.6);
        myAlbum1.addSong("Lady double dealer", 3.21);
        myAlbum1.addSong("You can't do it right", 6.23);
        myAlbum1.addSong("High ball shooter", 4.27);
        myAlbum1.addSong("The gypsy", 4.2);
        myAlbum1.addSong("Soldier of fortune", 3.13);

        albums.add(myAlbum1);


        Album myAlbum2 = new Album("For those about to rock", "Free Man");

        myAlbum2.addSong("For those about to rock", 5.44);
        myAlbum2.addSong("I put the finger on you", 3.25);
        myAlbum2.addSong("Lets go", 3.45);
        myAlbum2.addSong("Inject the venom", 3.33);
        myAlbum2.addSong("Snowballed", 4.51);
        myAlbum2.addSong("Evil walks", 3.45);
        myAlbum2.addSong("C.O.D.", 5.25);
        myAlbum2.addSong("Breaking the rules", 5.32);
        myAlbum2.addSong("Night of the long knives", 5.12);

        albums.add(myAlbum2);


        for (int i = 0; i<albums.size(); i++){

        }
    }

}