public class AdapterPatternTest {
    public static void main(String[] args) {
        System.out.println("--- Adapter Pattern Test ---");

        MediaPlayer vlcPlayer = new VlcAdapter(new AdvancedVlcPlayer());
        vlcPlayer.playAudio("vlc", "movie.vlc");

        MediaPlayer mp4Player = new Mp4Adapter(new AdvancedMp4Player());
        mp4Player.playAudio("mp4", "song.mp4");

        // Attempting to play unsupported format via adapter
        vlcPlayer.playAudio("mp3", "audio.mp3");
    }
}
