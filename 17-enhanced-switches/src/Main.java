import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        // Enhanced switch = A replacement to many else-if statements
        //                   More readable code
        //                   Multiple labels for a single case

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String day = scanner.nextLine();

        // Traditional switch
//        switch (day) {
//            case "Monday" -> System.out.println("It's a weekday 😢");
//            case "Tuesday" -> System.out.println("It's a weekday 😢");
//            case "Wednesday" -> System.out.println("It's a weekday 😢");
//            case "Thursday" -> System.out.println("It's a weekday 😢");
//            case "Friday" -> System.out.println("It's a weekday 😢");
//            case "Saturday" -> System.out.println("It's the weekend! 😎");
//            case "Sunday" -> System.out.println("It's the weekend! 😎");
//            default -> System.out.println("Not a valid day!");
//
//        }

        // Enhanced switch
        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It's a weekday 😢");
            case "Saturday", "Sunday" -> System.out.println("It's the weekend! 😎");
            default -> System.out.println("Not a valid day!");
        }

    }

}