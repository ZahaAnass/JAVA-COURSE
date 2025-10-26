public class Car {

    private final String model;
    private String color;
    private int price;

    Car(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car [model=" + this.model + ", color=" + getPrice() + ", price=" + this.price + "]";
    }

    // GETTERS
    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getPrice() {
        return this.price;
    }

    // SETTERS
    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        if(price > 0){
            this.price = price;
        } else {
            System.out.println("Price must be positive.");
        }
    }

}
