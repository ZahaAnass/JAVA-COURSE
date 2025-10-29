import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // HOW to PLAY AUDIO with Java (.wav, .au, .aiff files)

        String[] album = {
                "Boogie-Down-The-Grey-Room-_-Golden-Palms.wav",
                "Claim-To-Fame-The-Grey-Room-_-Clark-Sims.wav",
                "Purple-Desire-The-Grey-Room-_-Clark-Sims.wav",
                "Rapid-Unscheduled-Disassembly-The-Grey-Room-_-Density-_-Time.wav"
        };

        String filePath = "../album/Claim-To-Fame-The-Grey-Room-_-Clark-Sims.wav";

        File file = new File(filePath);

        try (Scanner scanner = new Scanner(System.in);
             AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file)
        ) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);

            String response = "";

            while(!response.equals("Q")){
                System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
                System.out.print("Enter your choice: ");

                response = scanner.next().toUpperCase();

                switch (response) {
                    case ("P") -> clip.start();
                    case ("S") -> clip.stop();
                    case ("R") -> clip.setMicrosecondPosition(0);
                    case ("Q") -> System.out.println("Quitting...");
                    default -> System.out.println("Not a valid response");
                }
            }

            clip.start();

        }
        catch (FileNotFoundException e) {
            System.out.println("The specified audio file was not found.");
        }
        catch(LineUnavailableException e) {
            System.out.println("Audio line for playing back is unavailable.");
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("The specified audio file is not supported.");
        }
        catch (IOException e) {
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("Bye !");
        }
    }
}