
public class Main {
    public static void main(String[] args) {

        // They help protect object data and add rules for accessing and modifying them
        // GETTERS = Methods that make a field READABLE
        // SETTERS = Methods that make a field WRITABLE

        Car car1 = new Car("Toyota", "Red", 30000);

        car1.setPrice(35000); // Using setter to modify price
        System.out.println("Car Price: " + car1.getPrice()); // Using getter to access price

        System.out.println(car1);

    }
}