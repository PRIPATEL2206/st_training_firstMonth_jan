package musicsStramingService;

import java.util.ArrayList;
import java.util.List;

class Playlist {
    private String name;
    private List<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void addSong(Song song) {
        songs.add(song);
        System.out.println("Added " + song.getTitle() + " to the playlist " + name);
    }

    public void displayPlaylist() {
        System.out.println("\nPlaylist: " + name);
        for (Song song : songs) {
            System.out.println("- " + song.getTitle() + " by " + song.getArtist() + " (" + song.getGenre() + ")");
        }
    }
}
