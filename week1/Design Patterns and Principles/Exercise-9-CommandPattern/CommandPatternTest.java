public class CommandPatternTest {
    public static void main(String[] args) {
        System.out.println("--- Command Pattern Test ---");

        MusicPlayer player = new MusicPlayer();

        Command play = new PlayCommand(player);
        Command pause = new PauseCommand(player);

        AppButton playButton = new AppButton();
        playButton.setCommand(play);

        AppButton pauseButton = new AppButton();
        pauseButton.setCommand(pause);

        System.out.println("Clicking Play:");
        playButton.click();

        System.out.println("Clicking Pause:");
        pauseButton.click();
    }
}
