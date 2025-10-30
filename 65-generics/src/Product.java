public class Product<T, U> {

    T name;
    U price;

    public Product(T name, U price) {
        this.name = name;
        this.price = price;
    }

    public T getName() {
        return name;
    }

    public U getPrice() {
        return price;
    }
}
