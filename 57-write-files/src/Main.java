import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {

        // How to write a file using Java (4 popular options)

        // FileWriter = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio files)

        try(FileWriter writer = new FileWriter("test.txt")){

        }catch(){
            
        }


    }
}