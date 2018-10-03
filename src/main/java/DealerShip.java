import Vehicles.Car;
import Vehicles.ElectricCar;
import Vehicles.HybridCar;
import Vehicles.Truck;
import DealerShip.Dealer;
import DealerShip.Customer;
import DealerShip.Till;

import java.util.ArrayList;

public class DealerShip {

    private Dealer dealer;
    private Customer customer;
    private Till till;
    private ArrayList<Car> cars;
    private ArrayList<Truck> trucks;
    private ArrayList<ElectricCar> electricCars;
    private ArrayList<HybridCar> hybridCars;


    public DealerShip(Dealer dealer, Customer customer, Till till,ArrayList<Car> cars, ArrayList<Truck> trucks, ArrayList<ElectricCar> electricCars, ArrayList<HybridCar> hybridCars) {

        this.dealer = new Dealer();
        this.customer = new Customer();
        this.till = new Till();
        this.cars = cars;
        this.trucks = trucks;
        this.electricCars = electricCars;
        this.hybridCars = hybridCars;
    }

    public int getNumberOfCars() {
        return cars.size();
    }

    public int getNumberOfTrucks() {
        return trucks.size();
    }

    public int getNumberOfElectricCars() {
        return electricCars.size();
    }

    public int getNumberOfHybridCars() {
        return hybridCars.size();
    }
}
