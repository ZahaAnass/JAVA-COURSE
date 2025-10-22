
public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Red");
        Car car2 = new Car("Honda", "Blue");
        Car car3 = new Car("Ford", "Black");

        // Car[] cars = new Car[3];
        // cars[0] = car1;
        // cars[1] = car2;
        // cars[2] = car3;
        // Car[] cars = {car1, car2, car3};

        Car[] cars = new Car[] {
            new Car("Toyota", "Red"),
            new Car("Honda", "Blue"),
            new Car("Ford", "Black")
        };


        for (Car car : cars) {
            car.drive();
        }

    }
}