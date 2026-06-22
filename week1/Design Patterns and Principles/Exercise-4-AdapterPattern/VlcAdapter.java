public class VlcAdapter implements MediaPlayer {
    private AdvancedVlcPlayer advancedVlcPlayer;

    public VlcAdapter(AdvancedVlcPlayer advancedVlcPlayer) {
        this.advancedVlcPlayer = advancedVlcPlayer;
    }

    @Override
    public void playAudio(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedVlcPlayer.playVlc(fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
