package io_exercise;

public class Vehicle {
    private VehicleType type;
    private String brand;
    private String model;
    private int price;

    public Vehicle(VehicleType type, String brand, String model, int price) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return ("Vehicle: " + brand + " Model: " + model + " Price: " + price);
    }
}
