package Vehicles;

import Component.Engine;
import Component.Tyre;

import java.util.ArrayList;

public abstract class Vehicle implements Runable {
    private Engine engine;
    private ArrayList<Tyre> tyres;
//    private Component.Tyre.Type type;
    private int price;
    private String color;
    private int miles;

    public Vehicle(Engine engine,  ArrayList<Tyre> tyres, int price, String color, int miles) {
        this.engine = engine;
        this.tyres = new ArrayList<>();
//        this.type = type;
        this.price = price;
        this.color = color;
        this.miles = 0;

    }

    public int getMiles() {
        return miles;
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
        this.tyres.add(tyre);
    }

    public int getTyreNumber() {
        return tyres.size();
    }

//    public Component.Tyre.Type getType() {
//        return type;
//    }


    @Override
    public void run(int distance) {
        this.miles += distance;

    }
}
