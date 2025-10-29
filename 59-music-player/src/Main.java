import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // HOW to PLAY AUDIO with Java (.wav, .au, .aiff files)
        // You can download free audio files from YouTube studio audio library
        // fill the "album" folder with your audio files to test this code with allowed formats
        // you can also convert mp3 files to wav files with online converters

        String[] albums = {
                "Boogie-Down-The-Grey-Room-_-Golden-Palms.wav",
                "Claim-To-Fame-The-Grey-Room-_-Clark-Sims.wav",
                "Purple-Desire-The-Grey-Room-_-Clark-Sims.wav",
                "Rapid-Unscheduled-Disassembly-The-Grey-Room-_-Density-_-Time.wav"
        };

        String filePath = getSong(albums);

        if (filePath == null) {
            System.out.println("please select a valid song next time.");
            return;
        }

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

    private static String getSong(String[] albums) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Available songs:");
        for (int i = 0; i < albums.length; i++) {
            System.out.println((i + 1) + ". " + albums[i]);
        }
        System.out.print("Select a song to play (1-" + albums.length + "): ");
        int choice = inputScanner.nextInt();
        if (choice < 1 || choice > albums.length) {
            System.out.println("Invalid choice. Exiting.");
            return null;
        }

        return "../album/" + albums[choice - 1];
    }
}