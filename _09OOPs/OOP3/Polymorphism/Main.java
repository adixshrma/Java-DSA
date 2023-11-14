package _09OOPs.OOP3.Polymorphism;

// Its shows method overriding.

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        shape.area();
        circle.area();
        square.area();
    }
}
