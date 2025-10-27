import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // How to write a file using Java (4 popular options)

        // FileWriter = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio files)

        String filePath = "test.txt";
        String textContent = "I like pizza!\nIt's my favorite food.\nBuy me pepperoni pizza.";
        textContent = """
                    Roses are red,
                    Violets are blue,
                    I love programming,
                    And so do you.
                    """;

        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("Successfully wrote to the file");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file location");
        }
        catch(IOException e){
            System.out.println("Could not write the file");
        }

    }
}