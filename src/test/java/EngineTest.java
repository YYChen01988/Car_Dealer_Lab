import Component.EngineType;
import org.junit.Before;
import org.junit.Test;
import Component.Engine;


import static junit.framework.TestCase.assertEquals;

public class EngineTest {
    Engine engine;


    @Before
    public void setUp(){
        this.engine = new Engine(100, EngineType.BATTERY) ;
        }


    @Test
    public void canGetHorsePower() {
        assertEquals(100, engine.getHorsePower());
    }

    @Test
    public void canGetEngineType() {
        assertEquals(EngineType.BATTERY, engine.getType());
    }
}
