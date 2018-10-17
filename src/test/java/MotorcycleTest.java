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

}
