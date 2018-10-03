package Vehicles;

import Component.Engine;
import Component.EngineType;
import Component.Tyre;

import java.util.ArrayList;

public class HybridCar extends Vehicle {

    private EngineType engineType;
    public HybridCar(Engine engine, ArrayList<Tyre> tyres, int price, String color, int miles, EngineType engineType) {
        super(engine, tyres, price, color, miles);

        this.engineType = EngineType.HYBRIDENGINE;
    }
}
