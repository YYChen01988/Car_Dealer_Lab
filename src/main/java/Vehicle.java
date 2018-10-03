import Component.Engine;
import Component.Tyre;

public class Vehicle {
    private Engine engine;
    private Tyre tyre;
    private Type type;

    public Vehicle(Engine engine, Tyre tyre, Type type) {
        this.engine = engine;
        this.tyre = tyre;
        this.type = type;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public Type getType() {
        return type;
    }
}
