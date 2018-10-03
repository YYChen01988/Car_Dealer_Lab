import Component.Engine;
import Component.EngineType;
import Component.Tyre;
import Vehicles.Car;
import Vehicles.Vehicle;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class CarTest {
    Car car;
    Engine engine1;
    Tyre tyre1, tyre2, tyre3, tyre4;
    ArrayList<Tyre> tyres;

    @Before
    public void setUp() {
        engine1 = new Engine(100, EngineType.ENGINE);
        tyre1 = new Tyre();
        tyre2 = new Tyre();
        tyre3 = new Tyre();
        tyre4 = new Tyre();
        tyres = new ArrayList<>();
        car = new Car(engine1, tyres, 500, "Black", 0, EngineType.ENGINE) {
        };
        car.addTyre(tyre1);
        car.addTyre(tyre2);
        car.addTyre(tyre3);
        car.addTyre(tyre4);
    }

    @Test
    public void canGetVehiclePrice() {
        assertEquals(500, car.getPrice());
    }

    @Test
    public void canGetVehicleColor() {
        assertEquals("Black", car.getColor());
    }

    @Test
    public void canGetEngineType() {
        assertEquals(EngineType.ENGINE, car.getEngine().getType());
    }

    @Test
    public void canGetVehicleEngineType() {
        assertEquals(EngineType.ENGINE, car.getEnginetype());
    }

    @Test
    public void canGetEngineHorsePower() {
        assertEquals(100, car.getEngine().getHorsePower());
    }

    @Test
    public void canGetTyreNumber() {
        assertEquals(4, car.getTyreNumber());
    }

    @Test
    public void canRun() {
        car.run(10);
        assertEquals(10, car.getMiles());
    }
}
