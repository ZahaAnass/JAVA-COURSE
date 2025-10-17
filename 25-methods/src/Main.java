import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // method = a block of reusable code that is executed when called ()
        happyBirthday("Spongebob", 30);

        Scanner scanner = new Scanner(System.in);

        // --- Test getFullName() ---
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        String fullName = getFullName(firstName, lastName);
        System.out.println("Your full name is: " + fullName);

        // --- Test square() and cube() ---
        System.out.print("Enter a number to square and cube: ");
        double number = scanner.nextDouble();

        System.out.printf("Square of %.2f is %.2f\n", number, square(number));
        System.out.printf("Cube of %.2f is %.2f\n", number, cube(number));

        // --- Test ageCheck() ---
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (ageCheck(age)) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are not an adult yet.");
        }

        scanner.close();
    }

    static void happyBirthday(String name, int age) {
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");
    }

    static double square(double number) {
        return number * number;
    }

    static double cube(double number) {
        return number * number * number;
    }

    static String getFullName(String first, String last) {
        return first + " " + last;
    }

    static boolean ageCheck(int age) {
        return age >= 18;
    }
}
