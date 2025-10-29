import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // JAVA HANGMAN GAME

        String word = "pizza";

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for(int i = 0, n = word.length(); i < n; i++) {
            wordState.add('_');
        }

        System.out.println("************************");
        System.out.println("Welcome to Java Hangman!");
        System.out.println("************************");

        while(wrongGuesses < 6) {

            System.out.println(getHangmanArt(wrongGuesses));

            System.out.print("Word: ");

            for(char c: wordState) {
                System.out.print(c + " ");
            }

            System.out.println();

            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if(word.indexOf(guess) >= 0) {
                System.out.println("Correct guess!");

                for(int i = 0, n = word.length(); i < n; i++) {
                    if(word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }
                }

                if(!wordState.contains('_')) {
                    break;
                }

            } else {
                wrongGuesses++;
                System.out.println("Wrong guess!");
            }
        }

        if(wrongGuesses >= 6) {
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.println("Game Over! The word was: " + word);
        } else {
            System.out.println("YOU WIN! You've guessed the word: " + word);
        }

        scanner.close();

    }

    static String getHangmanArt(int wrongGuesses) {

        String[] hangmanStages = {
            """
               -----
               |   |
                   |
                   |
                   |
                   |
            =========
            """,
            """
               -----
               |   |
               O   |
                   |
                   |
                   |
            =========
            """,
            """
               -----
               |   |
               O   |
               |   |
                   |
                   |
            =========
            """,
            """
               -----
               |   |
               O   |
              /|   |
                   |
                   |
            =========
            """,
            """
               -----
               |   |
               O   |
              /|\\  |
                   |
                   |
            =========
            """,
            """
               -----
               |   |
               O   |
              /|\\  |
              /    |
                   |
            =========
            """,
            """
               -----
               |   |
               O   |
              /|\\  |
              / \\  |
                   |
            =========
            """
        };

        if (wrongGuesses < hangmanStages.length) {
            return hangmanStages[wrongGuesses];
        } else {
            return hangmanStages[hangmanStages.length - 1];
        }

    }
}