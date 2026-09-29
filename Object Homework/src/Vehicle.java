public class Vehicle {

    String brand;
    int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void showInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }

    public static void main(String[] args) {

        Car car = new Car("Mercedes", 200);
        Motorcycle motorcycle = new Motorcycle("Honda", 150);

        car.showInfo();
        car.drive();

        System.out.println();

        motorcycle.showInfo();
        motorcycle.ride();
    }
}

class Car extends Vehicle {

    public Car(String brand, int speed) {
        super(brand, speed);
    }

    public void drive() {
        System.out.println("Car is driving");
    }
}

class Motorcycle extends Vehicle {

    public Motorcycle(String brand, int speed) {
        super(brand, speed);
    }

    public void ride() {
        System.out.println("Motorcycle is riding");
    }
}