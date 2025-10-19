import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // JAVA SLOT MACHINE

        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        System.out.println("*********************************");
        System.out.println("Welcome to the Java Slot Machine!");
        System.out.println("        Symbols: ♠ ♥ ♦ ♣ ★       ");

        while(balance > 0) {
            System.out.println("*********************************");
            System.out.println("Current Balance: $" + balance);
            System.out.print("Enter your bet amount: $");
            bet = scanner.nextInt();
            scanner.nextLine(); // consume newline character \n

            if(bet > balance) {
                System.out.println("Bet exceeds current balance. Please enter a valid bet.");
                continue;
            } else if(bet <= 0) {
                System.out.println("Bet must be greater than zero. Please enter a valid bet.");
                continue;
            }else {
                balance -= bet;
            }

            System.out.print("Spinning");
            for (int i = 0; i < 3; i++) {
                Thread.sleep(500);
                System.out.print(".");
            }
            System.out.println();

            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            if(payout > 0) {
                balance += payout;
                System.out.println("Congratulations! You won $" + payout + " this round.");
            }else{
                System.out.println("Sorry You lost This round.");
            }

            if (balance <= 0) {
                System.out.println("You have run out of balance!");
                break;
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.nextLine().toUpperCase();

            if(!playAgain.equals("YES") && !playAgain.equals("Y")) {
                break;
            }

        }

        System.out.println("Thank you for playing! Your final balance is: $" + balance);

        scanner.close();

    }

    static String[] spinRow() {

        String[] symbols = {"♠", "♥", "♦", "♣", "★"};
        String[] row = new String[3];
        Random random = new Random();

        for(int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    static void printRow(String[] row) {
        System.out.println("-------------");
        // System.out.println("| " + row[0] + " | " + row[1] + " | " + row[2] + " |");
        System.out.println("| " + String.join(" | ",row) + " |");
        System.out.println("-------------");
    }

    static int getPayout(String[] row, int bet) {

        if(row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "♣" -> bet * 20;
                case "★" -> bet * 10;
                case "♠" -> bet * 5;
                case "♥" -> bet * 4;
                case "♦" -> bet * 3;
                default -> 0;
            };
        }else if(row[0].equals(row[1])) {
            return switch (row[0]) {
                case "♣" -> bet * 8;
                case "★" -> bet * 6;
                case "♠" -> bet * 4;
                case "♥" -> bet * 3;
                case "♦" -> bet * 2;
                default -> 0;
            };
        } else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "♣" -> bet * 8;
                case "★" -> bet * 6;
                case "♠" -> bet * 4;
                case "♥" -> bet * 3;
                case "♦" -> bet * 2;
                default -> 0;
            };
        }
        return 0;
    }
}