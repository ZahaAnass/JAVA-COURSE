public class Main {
    public static void main(String[] args) {

        // .toString() = Method inherited from the Object class.
        //               Used to return a string representation of an object.
        //               By default, it returns a hash code as a unique identifier.
        //               It can be overridden to provide meaningful details.

        Car car1 = new Car("Toyota", "Corolla", 2020, "Blue");
        Car car2 = new Car("Honda", "Civic", 2019, "Red");


        System.out.println(car1); // return hash code by default like: Car@15db9742
                                 // return overridden toString() method: 2020 Blue Toyota Corolla
        System.out.println(car2); // return hash code by default like: Car@6d06d69c
                                 // return overridden toString() method: 2019 Red Honda Civic
    }
}