import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // HOW to PLAY AUDIO with Java (.wav, .au, .aiff files)

        String filePath = "../album/track1.wav";
        File file = new File(filePath);

        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);

        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("The specified audio file is not supported.");
        }
        catch (IOException e) {
            System.out.println("Something went wrong");
        }



    }
}