import java.util.ArrayDeque;
import java.util.Deque;

public class PlayListDone {
        Deque<String> songs = new ArrayDeque<>(); // Deque to store the playlist
        // Add a song to the end of the playlist
        public void addSong(String song) {
            songs.addLast(song);
            System.out.println("Added: " + song);
        }
        // Play the current song (the one at the front of the deque)
        public void playSong() {
            if (!songs.isEmpty()) {
                // Get the first song without removing it
//                String currentSong = songs.peekFirst();
                // or do this
                String currentSong = songs.removeFirst(); // Remove and play the first song
                System.out.println("Playing: " + currentSong);
            } else {
                System.out.println("No songs in the playlist.");
            }
        }
        // Skip the current song and play the next one
        public void skipSong() {
            if (!songs.isEmpty()) {
                String skippedSong = songs.removeFirst(); // Remove the current song
                System.out.println("Skipped: " + skippedSong);
                playSong(); // Play the next song
            } else {
                System.out.println("No more songs to skip.");
            }
        }
    }

