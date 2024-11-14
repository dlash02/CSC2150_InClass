public class PlayListDriver {
    public static void main(String[] args) {
        PlayList playlist = new PlayList();

        // Test the playlist functionality
        playlist.addSong("Song A");
        playlist.addSong("Song B");
        playlist.addSong("Song C");
        playlist.addSong("Song D");

        playlist.playSong(); // Should play "Song A"
        playlist.skipSong(); // Should skip to "Song B" and then play C
        playlist.playSong(); // Should play d
        playlist.skipSong(); // No song to skip
    }
}
