package musicsStramingService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class User {
    private String username;
    private List<Playlist> playlists;
    private List<Song> likedSongs;

    public User(String username) {
        this.username = username;
        this.playlists = new ArrayList<>();
        this.likedSongs = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public void createPlaylist(String playlistName) {
        Playlist playlist = new Playlist(playlistName);
        playlists.add(playlist);
        System.out.println(username + " created a new playlist: " + playlistName);
    }

    public void addSongToPlaylist(Song song, Playlist playlist) {
        if (playlists.contains(playlist)) {
            playlist.addSong(song);
        } else {
            System.out.println(username + " does not own the playlist: " + playlist.getName());
        }
    }

    public void likeSong(Song song) {
        likedSongs.add(song);
        System.out.println(username + " liked the song: " + song.getTitle());
    }

    public void recommendSongs() {
        System.out.println("\nRecommended Songs for " + username + ":");
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            Playlist randomPlaylist = playlists.get(random.nextInt(playlists.size()));
            List<Song> playlistSongs = randomPlaylist.getSongs();

            if (!playlistSongs.isEmpty()) {
                Song randomSong = playlistSongs.get(random.nextInt(playlistSongs.size()));
                System.out.println("- " + randomSong.getTitle() + " by " + randomSong.getArtist() +
                        " from playlist " + randomPlaylist.getName());
            }
        }
    }
}
