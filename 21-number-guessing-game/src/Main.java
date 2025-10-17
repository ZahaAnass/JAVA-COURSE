import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // NUMBER GUESSING GAME

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1); // Generates a random number between min and max

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.printf("Guess a number between %d and %d: \n", min, max);

        do{
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("Too low! Try again.");
            } else if(guess > randomNumber){
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
                System.out.println("Random Number was: " + randomNumber);
            }

        }while(guess != randomNumber);

        scanner.close();

    }

}