package lab1;
class Vehicle {
    private String make;
    private String model;
    private int year;
    private int maximumSpeed;

    public Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    public void drive() {
        System.out.println(make + " " + model + " is driving.");
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }
}

class Car extends Vehicle {
    public Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " Car is driving.");
    }
}

class Bike extends Vehicle {
    public Bike(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " " + getModel() + " Bike is driving.");
    }
}

public class VehicleDemo{
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022, 180);
        Bike bike = new Bike("Honda", "CBR500R", 2021, 150);

        System.out.println("Car: ");
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Maximum Speed: " + car.getMaximumSpeed());

        System.out.println("\nBike: ");
        System.out.println("Make: " + bike.getMake());
        System.out.println("Model: " + bike.getModel());
        System.out.println("Year: " + bike.getYear());
        System.out.println("Maximum Speed: " + bike.getMaximumSpeed());

        car.drive();
        bike.drive();
    }
}