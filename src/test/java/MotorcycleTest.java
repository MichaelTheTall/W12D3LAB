import Vehicles.Colour;
import Vehicles.Components.Engine;
import Vehicles.Components.Tank;
import Vehicles.Fuel;
import Vehicles.Motorcycle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MotorcycleTest {

    Motorcycle motorcycle;
    Engine engine;
    Tank tank;

    @Before
    public void before() {
        engine = new Engine(300, "Ducati", Fuel.PETROL);
        tank = new Tank(500);
        motorcycle = new Motorcycle(0, 2, Colour.BLACK, 2000.00, engine, tank);
    }

    @Test
    public void fuelDepletesByDistance() {
        motorcycle.refuel();
        motorcycle.travel(200);
        assertEquals(300, motorcycle.getFuelLevel());
    }

    @Test
    public void notenough() {
        motorcycle.travel(200);
        assertEquals(100, motorcycle.getFuelLevel());
    }

    @Test
    public void refuel(){
        assertEquals("refueling... Complete!", motorcycle.refuel());
        assertEquals(500, motorcycle.getFuelLevel());
    }

    @Test
    public void startEngine(){
        assertEquals("Vroooom", motorcycle.startEngine());
    }

    @Test
    public void stopEngine(){
        assertEquals("Engine stopped.", motorcycle.stopEngine());
    }


    @Test
    public void getDoors() {
        assertEquals(0, motorcycle.getNumOfDoors());
    }

    @Test
    public void getWheels() {
        assertEquals(2, motorcycle.getNumOfWheels());
    }

    @Test
    public void getColour() {
        assertEquals(Colour.BLACK, motorcycle.getColour());
    }

    @Test
    public void getPrice() {
        assertEquals(2000.00, motorcycle.getPrice(), 0.1);
    }

    @Test
    public void getEngine() {
        assertEquals(engine, motorcycle.getEngine());
    }

    @Test
    public void getTank() {
        assertEquals(tank, motorcycle.getTank());
    }
    
    
}
