import Vehicles.*;
import Vehicles.Components.Engine;
import Vehicles.Components.Tank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Engine engine;
    Tank tank;
    Car car;

    @Before
    public void before() {
        engine = new Engine(300, "Ducati", Fuel.PETROL);
        tank = new Tank(5000);
        car = new Car(4, 4, Colour.BLUE, 20000.00, engine, tank);
    }

    @Test
    public void getDoors() {
        assertEquals(4, car.getNumOfDoors());
    }

    @Test
    public void getWheels() {
        assertEquals(4, car.getNumOfWheels());
    }

    @Test
    public void getColour() {
        assertEquals(Colour.BLUE, car.getColour());
    }

    @Test
    public void getPrice() {
        assertEquals(20000.00, car.getPrice(), 0.1);
    }

    @Test
    public void getEngine() {
        assertEquals(engine, car.getEngine());
    }

    @Test
    public void getTank() {
        assertEquals(tank, car.getTank());
    }

    @Test
    public void fuelDepletesByDistance() {
        car.refuel();
        car.travel(200);
        assertEquals(4800, car.getFuelLevel());
    }

    @Test
    public void notenough() {
        car.travel(200);
        assertEquals(100, car.getFuelLevel());
    }

    @Test
    public void refuel(){
        assertEquals("refueling... Complete!", car.refuel());
        assertEquals(5000, car.getFuelLevel());
    }

    @Test
    public void startEngine(){
        assertEquals("Vroooom", car.startEngine());
    }

    @Test
    public void stopEngine(){
        assertEquals("Engine stopped.", car.stopEngine());
    }
}



