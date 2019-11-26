package io_exercise;

public class Car extends Vehicle {
    private int topSpeed;
    private Transmission transmission;
    private Shape shape;


    public Car(VehicleType type, String brand, String model, int price, int topSpeed, Transmission transmission, Shape shape) {
        super(type, brand, model, price);
        this.topSpeed = topSpeed;
        this.shape = shape;
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return ("Car: " + getBrand() + " Model: " + getModel() + " Price: " + getPrice()
                + " Top speed: " + topSpeed + " Transmission: " + transmission + " Shape: " + shape);
    }
}
