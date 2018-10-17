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

public class DealershipTest {

    Dealership dealership;
    Dealer dealer;
    Till till;
    Engine engine;
    Tank tank;
    Motorcycle motorcycle;
    Car car;
    Truck truck;
    Customer customer;

    @Before
    public void before() {
        engine = new Engine(300, "Ducati", Fuel.PETROL);
        tank = new Tank(500);
        motorcycle = new Motorcycle(0, 2, Colour.BLACK, 2000.00, engine, tank);
        car = new Car(4, 4, Colour.BLUE, 20000.00, engine, tank);
        truck = new Truck(2, 18, Colour.ORANGE, 100000.00, engine, tank);
        dealer = new Dealer("Frank");
        till = new Till(300.00);
        customer = new Customer(40000.00, "Bob");
        dealership = new Dealership(dealer, till, "Ye average dealership");
    }

    @Test
    public void addStock() {
        dealership.addStock(car);
        dealership.addStock(motorcycle);
        dealership.addStock(truck);
        assertEquals(3, dealership.getStock().size());
    }

    @Test
    public void sellVehicle() {
        dealership.addStock(car);
        dealership.addStock(motorcycle);
        dealership.addStock(truck);
        dealership.sellVehicle(car, customer);
        assertEquals(2, dealership.getStock().size());
        assertEquals(20000.00, customer.getWallet(), 0.01);
        assertEquals(20300.00, dealership.getTill(), 0.01);
    }
}
