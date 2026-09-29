public interface Shape {

    double calculateArea();

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(10, 4);
        Triangle triangle = new Triangle(6, 8);

        System.out.println("Circle area: " +
                circle.calculateArea());

        System.out.println("Rectangle area: " +
                rectangle.calculateArea());

        System.out.println("Triangle area: " +
                triangle.calculateArea());
    }
}

class Circle implements Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {

    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Triangle implements Shape {

    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base * height / 2;
    }
}