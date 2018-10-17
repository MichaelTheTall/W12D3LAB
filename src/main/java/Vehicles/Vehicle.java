package Vehicles;

public abstract class Vehicle {
    private int numOfDoors;
    private int numOfWheels;
    private Colour colour;

    private double price;

    private int fuelLevel;

    public Vehicle(int numOfDoors, int numOfWheels, Colour colour, double price){
        this.numOfDoors = numOfDoors;
        this.numOfWheels = numOfWheels;
        this.colour = colour;
        this.fuelLevel = 100;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }
}
