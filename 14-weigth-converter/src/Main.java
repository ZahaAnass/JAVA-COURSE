import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // WEIGHT CONVERTER

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Convertion Program");
        System.out.println("1. Convert lbs to kgs");
        System.out.println("2. Convert kgs to lbs");

        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        System.out.println("You chose option: " + choice);

        if (choice == 1) {
            System.out.print("Enter weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("%.2f lbs is equal to %.2f kgs\n", weight, newWeight);
        } else if (choice == 2) {
            System.out.print("Enter weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight / 0.453592;
            System.out.printf("%.2f kgs is equal to %.2f lbs%n", weight, newWeight);
        } else {
            System.out.println("Not a valid option.");
        }

    }

}