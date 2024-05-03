// Abstract class
abstract class Shape {
    // Abstract method (does not have a body)
    public abstract void draw();
}

// Concrete class that extends Shape
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Concrete class that extends Shape
class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Mainabst {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        shape1.draw();  // Output: Drawing a circle

        Shape shape2 = new Rectangle();
        shape2.draw();  // Output: Drawing a rectangle
    }
}
