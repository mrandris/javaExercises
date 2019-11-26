package io_exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {

        VehicleRepository vehicleRepo = new VehicleRepository();
        VehicleFactory vehicleFactory = new VehicleFactory();
        File vehicles = new File("vehicles.txt");

        System.out.println("Input vehicles:");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(vehicles))) {
            String fileLine;
            while ((fileLine = bufferedReader.readLine()) != null) {
                System.out.println(fileLine);
                String[] variables = fileLine.split(", ");

                VehicleType type = vehicleFactory.setVehicleType(variables[0]);
                Vehicle vehicle = vehicleFactory.createVehicle(type, variables);

                vehicleRepo.addVehicle(vehicle, type);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nStored vehicles:");
        for (Vehicle v : vehicleRepo.getVehicleList()) {
            System.out.println(v);
        }

        System.out.println("Number of cars:" + vehicleRepo.getCarCounter());
        System.out.println("Number of motorcycles:" + vehicleRepo.getMotorcycleCounter());
        System.out.println("Number of tractors:" + vehicleRepo.getTractorCounter());
        System.out.println("Number of other vehicles:" + vehicleRepo.getOtherVehicleCounter());

        vehicleRepo.getCarList().sort(new SortCarByPrice());

        System.out.println("\nCars by price: ");
        for(Vehicle c : vehicleRepo.getCarList()) {
            System.out.println(c);
        }

        vehicleRepo.getMotorList().sort(new SortMotorcycleByTopSpeed());
        System.out.println("\nMotorcycles by top speed: ");
        for(Motorcycle m : vehicleRepo.getMotorList()) {
            System.out.println(m);
        }
    }
}

class SortCarByPrice implements Comparator<Car> {
    public int compare(Car a, Car b)
    {
        return a.getPrice() - b.getPrice();
    }
}

class SortMotorcycleByTopSpeed implements Comparator<Motorcycle> {
    public int compare(Motorcycle a, Motorcycle b)
    {
        return a.getTopSpeed() - b.getTopSpeed();
    }
}
