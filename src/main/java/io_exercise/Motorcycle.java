package io_exercise;

public class Motorcycle extends Vehicle{
    private int topSpeed;
    private Shape shape;


    public Motorcycle(VehicleType type, String brand, String model, int price, int topSpeed, Shape shape) {
        super(type, brand, model, price);
        this.topSpeed = topSpeed;
        this.shape = shape;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    @Override
    public String toString() {
        return ("Motorcycle: " + getBrand() + " Model: " + getModel() + " Price: " + getPrice()
                + " Top speed: " + topSpeed + " Shape: " + shape);
    }
}
