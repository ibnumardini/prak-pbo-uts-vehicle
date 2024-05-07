package kendaraan;

import mesin.Mesin;

abstract public class Vehicle {
    private String fuel;
    private Mesin engine;
    private String brand;

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getFuel() {
        return fuel;
    }

    public void setEngine(Mesin engine) {
        this.engine = engine;
    }

    public Mesin getEngine() {
        return engine;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
