package Vehicles.Components;

import Vehicles.Fuel;

public class Engine {
    private int size;
    private String model;
    private Fuel fuel;
    
    public Engine(int size, String model, Fuel fuel) {
        this.size = size;
        this.model = model;
        this.fuel = fuel;
    }

    public int getSize() {
        return size;
    }

    public String getModel() {
        return model;
    }

    public Fuel getFuel() {
        return fuel;
    }
}
