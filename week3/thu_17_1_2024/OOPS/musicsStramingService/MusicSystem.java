package musicsStramingService;


public class MusicSystem {
    public static void main(String[] args) {
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        Song song1 = new Song("Song1", "Artist1", "Pop");
        Song song2 = new Song("Song2", "Artist2", "Rock");
        Song song3 = new Song("Song3", "Artist3", "Hip Hop");

        user1.createPlaylist("My Favorites");
        user1.createPlaylist("Workout Mix");
        user2.createPlaylist("Chill Vibes");

        user1.addSongToPlaylist(song1, user1.getPlaylists().get(0));
        user1.addSongToPlaylist(song2, user1.getPlaylists().get(1));
        user1.addSongToPlaylist(song3, user1.getPlaylists().get(1));

        user2.addSongToPlaylist(song2, user2.getPlaylists().get(0));
        user2.addSongToPlaylist(song3, user2.getPlaylists().get(0));
    }
}
