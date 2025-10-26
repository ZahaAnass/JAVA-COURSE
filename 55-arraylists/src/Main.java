import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ArrayList = A resizeable array that stores objects (autoboxing)
        //                     Arrays are fixed in size, but ArrayLists can change

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Coconut");

        fruits.remove(1);
        fruits.set(0, "Pineapple");
        System.out.println(fruits.getFirst());
        System.out.println("Size: " + fruits.size());

        Collections.sort(fruits);

        for(String fruit : fruits){
            System.out.println(fruit);
        }

        System.out.println("-".repeat(20));

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the # of food you would like: ");
        int numberOfFoods = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for(int i = 0; i < numberOfFoods; i++){
            System.out.print("Enter food " + (i + 1) + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println("Your favorite foods are: ");
        System.out.println("-".repeat(20));

        for(String food : foods){
            System.out.println(food);
        }

        scanner.close();

    }

}