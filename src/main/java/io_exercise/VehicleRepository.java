package io_exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VehicleRepository {
    private List<Vehicle> vehicleList = new ArrayList<>();
    private List<Car> carList = new ArrayList<>();
    private List<Motorcycle> motorList = new ArrayList<>();
    private List<Tractor> tractorList = new ArrayList<>();
    private List<Vehicle> otherVehicleList = new ArrayList<>();
    private int carCounter;
    private int motorcycleCounter;
    private int tractorCounter;
    private int otherVehicleCounter;

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public int getCarCounter() {
        return carCounter;
    }

    public int getMotorcycleCounter() {
        return motorcycleCounter;
    }

    public int getTractorCounter() {
        return tractorCounter;
    }

    public int getOtherVehicleCounter() {
        return otherVehicleCounter;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public List<Motorcycle> getMotorList() {
        return motorList;
    }

    public List<Tractor> getTractorList() {
        return tractorList;
    }

    public List<Vehicle> getOtherVehicleList() {
        return otherVehicleList;
    }

    public void addVehicle(Vehicle v, VehicleType type) {
        vehicleList.add(v);

        switch (type) {
            case CAR:
                carCounter++;
                carList.add((Car) v);
                break;
            case MOTORCYCLE:
                motorcycleCounter++;
                motorList.add((Motorcycle) v);
                break;
            case TRACTOR:
                tractorCounter++;
                tractorList.add((Tractor) v);
                break;
            default:
                otherVehicleCounter++;
                otherVehicleList.add(v);
        }
    }
}
