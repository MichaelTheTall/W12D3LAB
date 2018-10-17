package Vehicles;

import Vehicles.Components.Engine;
import Vehicles.Components.Tank;
import behaviours.IFuel;
import behaviours.IPaint;
import behaviours.IRun;

public class Truck extends Vehicle implements IFuel, IPaint, IRun {
    Engine engine;
    Tank tank;

    public Truck(int numOfDoors, int numOfWheels, Colour colour, double price, Engine engine, Tank tank) {
        super(numOfDoors, numOfWheels, colour, price);
        this.engine = engine;
        this.tank = tank;
    }

    @Override
    public void travel(int distance){
        int newFuelLevel = getFuelLevel() - distance;
        if(getFuelLevel() <= distance) {
            return;
        } else {
            setFuelLevel(newFuelLevel);
        }
    }

    @Override
    public String startEngine(){
        if(engine.getFuel() == Fuel.ELECTRIC) {
            return "Beepity-boop";
        } else {
            return "Vroooom";
        }
    }

    @Override
    public String stopEngine(){
        return "Engine stopped.";
    }

    @Override
    public void repaint(Colour colour) {
        setColour(colour);
    }

    @Override
    public String refuel() {
        setFuelLevel(tank.getCapacity());
        if (engine.getFuel() == Fuel.ELECTRIC) {
            return "recharging... Complete!";
        } else {
            return "refueling... Complete!";
        }
    }
}
