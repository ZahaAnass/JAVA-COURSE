
public class Main {
    public static void main(String[] args) {

        // Generics = A concept where you can write a class, interface, or method
        //            that is compatible with different data types.
        //            <T> type parameter (placeholder that gets replaced with a real type)
        //            <String> type argument (specifies the type)

        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello, Generics!");
        System.out.println(stringBox.getItem());

        Product<String, Double> product = new Product<>("Laptop", 999.99);
        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Price: $" + product.getPrice());

        Product<String, Integer> anotherProduct = new Product<>("Book", 20);
        System.out.println("Product Name: " + anotherProduct.getName());
        System.out.println("Product Price: $" + anotherProduct.getPrice());

    }
}