public class Mp4Adapter implements MediaPlayer {
    private AdvancedMp4Player advancedMp4Player;

    public Mp4Adapter(AdvancedMp4Player advancedMp4Player) {
        this.advancedMp4Player = advancedMp4Player;
    }

    @Override
    public void playAudio(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedMp4Player.playMp4(fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
