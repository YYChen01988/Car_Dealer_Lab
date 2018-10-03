package Vehicles;

import Component.Engine;
import Component.Tyre;

import java.util.ArrayList;

public class Truck extends Vehicle {


    public Truck(Engine engine, ArrayList<Tyre> tyres, int price, String color, int miles) {
        super(engine, tyres, price, color, miles);
    }

//    public String run() {
//        return"The truck is running";
//    }
}
