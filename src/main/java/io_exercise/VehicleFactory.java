package io_exercise;

public class VehicleFactory {

    public VehicleType setVehicleType(String str) {
        switch (str) {
            case "Car":
                return VehicleType.CAR;
            case "Motorcycle":
                return VehicleType.MOTORCYCLE;
            case "Tractor":
                return VehicleType.TRACTOR;
            default:
                return VehicleType.OTHER;
        }
    }

    public Vehicle createVehicle(VehicleType type, String[] variables) {
        switch (type) {
            case CAR:
                String carBrand = variables[1];
                String carModel = variables[2];
                int carPrice = Integer.parseInt(variables[3]);
                int carSpeed = Integer.parseInt(variables[4]);
                Transmission transmission = setTransmission(variables[5]);
                Shape carShape = setCarShape(variables[6]);

                return new Car(type, carBrand, carModel, carPrice, carSpeed, transmission, carShape);

            case MOTORCYCLE:
                String motorBrand = variables[1];
                String motorModel = variables[2];
                int motorPrice = Integer.parseInt(variables[3]);
                int motorSpeed = Integer.parseInt(variables[4]);
                Shape motorShape = setMotorShape(variables[5]);

                return new Motorcycle(type, motorBrand, motorModel, motorPrice, motorSpeed, motorShape);

            case TRACTOR:
                String tractorBrand = variables[1];
                String tractorModel = variables[2];
                int tractorPrice = Integer.parseInt(variables[3]);
                int maxPulledWeight = Integer.parseInt(variables[4]);
                return new Tractor(type, tractorBrand, tractorModel, tractorPrice, maxPulledWeight);

            case OTHER:
                String vehicleBrand = variables[1];
                String vehicleModel = variables[2];
                int vehiclePrice = Integer.parseInt(variables[3]);
                return new Vehicle(type, vehicleBrand, vehicleModel, vehiclePrice);
        }
        return null;
    }

    public Transmission setTransmission(String str) {
        switch (str) {
            case "Automatic":
                return Transmission.AUTOMATIC;
            case "Manual":
                return Transmission.MANUAL;
            default:
                return Transmission.UNKNOWN;
        }
    }

    public Shape setCarShape(String str) {
        switch (str) {
            case "Coupe":
                return Shape.COUPE;
            case "Sedan":
                return Shape.SEDAN;
            case "Wagon":
                return Shape.WAGON;
            default:
                return Shape.UNKNOWN;
        }
    }

    public Shape setMotorShape(String str) {
        switch (str) {
            case "Chopper":
                return Shape.CHOPPER;
            case "Cruiser":
                return Shape.CRUISER;
            case "Enduro":
                return Shape.ENDURO;
            default:
                return Shape.UNKNOWN;
        }
    }
}
