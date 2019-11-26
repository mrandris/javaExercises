package io_exercise;

public class Tractor extends Vehicle{
    private int maxPulledWeight;

    public Tractor(VehicleType type, String brand, String model, int price, int maxPulledWeight) {
        super(type, brand, model, price);
        this.maxPulledWeight = maxPulledWeight;
    }

    @Override
    public String toString() {
        return ("Tractor: " + getBrand() + " Model: " + getModel() + " Price: " + getPrice()
                + " Max pulled weight: " + maxPulledWeight);
    }
}
