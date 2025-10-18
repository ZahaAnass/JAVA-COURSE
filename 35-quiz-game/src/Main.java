import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // JAVA QUIZ GAME

        String[] questions = {
                "What is the capital of France? ",
                "What is 2 + 2? ",
                "What is the largest planet in our solar system? ",
                "What is the chemical symbol for water? ",
                "Who wrote 'Romeo and Juliet'? "
        };

        String[][] options = {
                {"1) Berlin", "2) Madrid", "3) Paris", "4) Rome"},
                {"1) 3", "2) 4", "3) 5", "4) 6"},
                {"1) Earth", "2) Jupiter", "3) Saturn", "4) Mars"},
                {"1) H2O", "2) CO2", "3) O2", "4) NaCl"},
                {"1) Charles Dickens", "2) William Shakespeare", "3) Mark Twain", "4) Jane Austen"}
        };

        int[] answers = {3, 2, 2, 1, 2};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("******************************");
        System.out.println("WELCOME TO THE JAVA QUIZ GAME");
        System.out.println("******************************");

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for(String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your answer (1-4): ");
            guess = scanner.nextInt();

            if(guess == answers[i]){
                System.out.println("********");
                System.out.println("CORRECT!");
                System.out.println("********");
                score++;
            } else {
                System.out.println("********************************");
                System.out.println("WRONG! The correct answer was option " + answers[i]);
                System.out.println("********************************");
            }

            System.out.println();

        }

        System.out.println("******************************");
        System.out.println("YOUR FINAL SCORE IS: " + score + " OUT OF " + questions.length);
        System.out.println("******************************");


        scanner.close();
    }

}