import Shop.Customer;
import Shop.Dealer;
import Shop.Dealership;
import Shop.Till;
import Vehicles.*;
import Vehicles.Components.Engine;
import Vehicles.Components.Tank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TruckTest {

    Engine engine;
    Tank tank;
    Truck truck;

    @Before
    public void before() {
        engine = new Engine(20000, "Benz", Fuel.DIESEL);
        tank = new Tank(24000);
        truck = new Truck(2, 18, Colour.ORANGE, 100000.00, engine, tank);
    }

    @Test
    public void getDoors() {
        assertEquals(2, truck.getNumOfDoors());
    }

    @Test
    public void getWheels() {
        assertEquals(18, truck.getNumOfWheels());
    }

    @Test
    public void getColour() {
        assertEquals(Colour.ORANGE, truck.getColour());
    }

    @Test
    public void getPrice() {
        assertEquals(100000.00, truck.getPrice(), 0.1);
    }

    @Test
    public void getEngine() {
        assertEquals(engine, truck.getEngine());
    }

    @Test
    public void getTank() {
        assertEquals(tank, truck.getTank());
    }

    @Test
    public void fuelDepletesByDistance() {
        truck.refuel();
        truck.travel(2000);
        assertEquals(22000, truck.getFuelLevel());
    }

    @Test
    public void notenough() {
        truck.travel(200);
        assertEquals(100, truck.getFuelLevel());
    }

    @Test
    public void refuel(){
        assertEquals("refueling... Complete!", truck.refuel());
        assertEquals(24000, truck.getFuelLevel());
    }

    @Test
    public void startEngine(){
        assertEquals("Vroooom", truck.startEngine());
    }

    @Test
    public void stopEngine(){
        assertEquals("Engine stopped.", truck.stopEngine());
    }
}
