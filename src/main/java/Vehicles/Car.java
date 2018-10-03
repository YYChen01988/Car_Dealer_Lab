package Vehicles;

import Component.Engine;
import Component.EngineType;
import Component.Tyre;

import java.util.ArrayList;

public class Car extends Vehicle{

    private EngineType enginetype;

    public Car(Engine engine, ArrayList<Tyre> tyres, int price, String color, int miles, EngineType enginetype) {
        super(engine, tyres, price, color, miles);

        this.enginetype = EngineType.ENGINE;
    }

    public EngineType getEnginetype() {
        return enginetype;
    }

    //    public String runing() {
//        return "The car is running";
//    }
}
