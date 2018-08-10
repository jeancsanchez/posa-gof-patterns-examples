package estrutural;

import com.sun.media.jfxmedia.track.Track;
import com.sun.media.jfxmedia.track.VideoResolution;
import com.sun.media.jfxmedia.track.VideoTrack;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.util.Locale;

/**
 * Estrural de objeto
 * <p>
 * Uma interface que encapsula subsistemas. Nesse exemplo, subsistemas de mídia são encapsulados para que o cliente só
 * use este Facade para interação.
 */

public class Facade {
    private MediaPlayer mediaPlayer;
    private VideoTrack videoTrack;


    public Facade() {
        mediaPlayer = new MediaPlayer(new Media(""));
        videoTrack = new VideoTrack(
                true,
                1,
                "",
                new Locale(Locale.CANADA.getLanguage()),
                Track.Encoding.MPEG1AUDIO,
                new VideoResolution(100, 100),
                2f,
                false
        );
    }

    public void configurarSom() {
        mediaPlayer.setBalance(3);
        mediaPlayer.setAudioSpectrumInterval(3);
        mediaPlayer.setVolume(5);
    }

    public void configurarVideo() {
        videoTrack.getFrameSize();
        videoTrack.isEnabled();
    }


    public void playSom() {
        mediaPlayer.play();
    }
}
