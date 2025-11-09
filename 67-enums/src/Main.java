import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // Enums = (Enumerations) A special kind of class that
        //         represents a fixed set of constants.
        //         They improve code readability and reliability.
        //         More efficient with switches than Strings.

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a day of the week: ");
            String response = scanner.nextLine().toUpperCase();

            Day day = Day.valueOf(response); // Convert String to Enum

            System.out.println(day); // Output: WEDNESDAY

            switch (day) {
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("It's a weekday.");
                case SATURDAY, SUNDAY -> System.out.println("It's the weekend!");
            }
        }catch (IllegalArgumentException e) {
            System.out.println("Invalid day entered.");
        }



    }
}
