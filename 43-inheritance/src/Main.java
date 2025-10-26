public class Main {

    public static void main(String[] args) {

        // Inheritance = One class inherits the attributes and methods
        //                         from another class.
        //                         Child <- Parent <- Grandparent

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(dog.isAlive ? "Dog is alive" : "Dog is not alive");
        System.out.println(cat.isAlive ? "Cat is alive" : "Cat is not alive");
        System.out.println(plant.isAlive ? "Plant is alive" : "Plant is not alive");

        dog.speak();
        cat.speak();
        plant.photosynthesize();


    }

}
