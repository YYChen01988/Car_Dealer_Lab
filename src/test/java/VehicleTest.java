import Component.Engine;
import Component.Tyre;
import com.sun.deploy.security.ValidationState;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class VehicleTest {

    Vehicle vehicle;
    Engine engine1;
    Tyre tyre;

    @Before
    public void setUp(){
        this.engine1 = new Engine(100);
        this.tyre = new Tyre();
        this.vehicle = new Vehicle(engine1, tyre,Type.CAR);
    }

    @Test
    public void canGetEngineHorsePower() {
        assertEquals(100, vehicle.getEngine().getHorsePower());
    }
}
