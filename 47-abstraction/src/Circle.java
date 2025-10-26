public class Circle extends Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    public void display() {
        System.out.println("Circle with radius: " + radius);
    }

}
