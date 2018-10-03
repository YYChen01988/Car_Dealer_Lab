import Component.Component;
import org.junit.Before;
import org.junit.Test;
import Component.Engine;

import static junit.framework.TestCase.assertEquals;

public class EngineTest {
    Engine engine;

    @Before
    public void setUp(){
        this.engine = new Engine(100) {
        };
    }

    @Test
    public void canGetHorsePower() {
        assertEquals(100, engine.getHorsePower());
    }
}
