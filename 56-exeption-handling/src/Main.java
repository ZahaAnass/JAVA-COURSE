import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Exception = An event that interrupts the normal flow of a program
        //             (Dividing by zero, file not found, mismatch input type)
        //             Surround any dangerous code with a try{} block
        //             try{}, catch{}, finally{}



        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        }
        catch (InputMismatchException e) {
            System.out.println("That wasn't a number!");
        }
        catch (ArithmeticException e) {
            System.out.println("YOU CAN'T DIVIDE BY ZERO!");
        }
        catch (Exception e) {
            // SAFETY NET
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("This always executes");
        }

    }

}