import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 9, 2, 8, 3, 5, 4, 7, 6};
        int target = 3;

        String[] fruits = {"apple", "orange", "banana"};
        String targetFruit;
        boolean isFound = false;

        System.out.print("Enter a fruit to search for: ");
        targetFruit = scanner.next();


        for(int i = 0; i < numbers.length; i++) {
            if(target == numbers[i]){
                System.out.println("Number found at index: " + i);
                break;
            }
        }

        for(int i = 0; i < fruits.length; i++) {
            if(targetFruit.equals(fruits[i])){
                System.out.println("Fruit found at index: " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("Element not found in the array.");
        }

    }

}