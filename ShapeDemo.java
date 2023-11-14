package lab1;

class Shape {
    public double getArea() {
        return 0.0;
    }
}

class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    private int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(6, 8);

        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Rectangle Area: " + rectangle.getArea());
    }
}
