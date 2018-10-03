import Component.Engine;
import Component.Tyre;
import com.sun.deploy.security.ValidationState;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class VehicleTest {

    Vehicle vehicle;
    Engine engine1;
    Tyre tyre1, tyre2, tyre3, tyre4;
    ArrayList <Tyre> tyres;

    @Before
    public void setUp(){
        engine1 = new Engine(100);
        tyre1 = new Tyre();
        tyre2 = new Tyre();
        tyre3 = new Tyre();
        tyre4 = new Tyre();
        tyres = new ArrayList<>();
        vehicle = new Vehicle(engine1, Type.CAR, tyres, 500, "Black");
        vehicle.addTyre(tyre1);
        vehicle.addTyre(tyre2);
        vehicle.addTyre(tyre3);
        vehicle.addTyre(tyre4);
    }

    @Test
    public void canGetVehiclePrice() {
        assertEquals(500, vehicle.getPrice());
    }

    @Test
    public void canGetVehicleColo() {
        assertEquals("Black", vehicle.getColor());
    }

    @Test
    public void canGetVehicleType() {
        assertEquals(Type.CAR, vehicle.getType());
    }

    @Test
    public void canGetEngineHorsePower() {
        assertEquals(100, vehicle.getEngine().getHorsePower());
    }

    @Test
    public void canGetTyreNumber() {
        assertEquals(4, vehicle.getTyreNumber());
    }



}
