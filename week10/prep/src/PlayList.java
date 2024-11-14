import java.util.ArrayDeque;
import java.util.Deque;
public class PlayList {
        Deque<String> songs = new ArrayDeque<>();
        // Deque to store the playlist
        // Add a song to the end of the playlist
        public void addSong(String song) {
            // ToDo: Add a song to the queue
            // ToDo: output "Added: song name"
        }
        // Play the current song (the one at the front of the deque)
        public void playSong() {
            // ToDo: If there is a song to play then
            //    get the first one to play, remove it from the list
            //    and output "Playing song name"
            //    If there is no song output "No Song to play"
        }
        // Skip the current song and play the next one
        public void skipSong() {
            // ToDo: if there is a song to skip then
            //    remove that song and play the next song in the queue
            // if there is no song to skip, then output "No songs to skip"
        }
    }

