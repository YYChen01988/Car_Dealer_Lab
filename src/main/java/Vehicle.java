import Component.Engine;
import Component.Tyre;

import java.util.ArrayList;

public class Vehicle {
    private Engine engine;
    private ArrayList<Tyre> tyres;
    private Type type;
    private int price;
    private String color;

    public Vehicle(Engine engine,Type type, ArrayList<Tyre> tyres, int price, String color) {
        this.engine = engine;
        this.tyres = new ArrayList<>();
        this.type = type;
        this.price = price;
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void addTyre(Tyre tyre) {
        tyres.add(tyre);
    }

    public int getTyreNumber() {
        return tyres.size();
    }

    public Type getType() {
        return type;
    }
}
