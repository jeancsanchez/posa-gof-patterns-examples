import comportamental.state.PlayerManager;
import comportamental.state.model.Audio;

public class Main {

    public static void main(String args[]) {
        // State test
        PlayerManager playerManager = new PlayerManager();
        Audio audio = new Audio();
        audio.setTitle("Audio test");

        playerManager.play(audio);
        playerManager.pause();

        playerManager.next();
        playerManager.play(audio);

        playerManager.previous();
        playerManager.play(audio);
    }
}
