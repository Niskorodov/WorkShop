package org.example.homework1.models;

import org.example.homework1.interfaces.Drivable;

public class Car implements Drivable {
    private String brand;
    private String model;
    private int year;
    private boolean isStarted = false;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void start() {
        isStarted = true;
        System.out.println("Car started.");
    }

    @Override
    public void stop() {
        isStarted = false;
        System.out.println("Car stopped.");
    }

    @Override
    public void drive(int distance) {
        if (isStarted) {
            System.out.println("Driving " + distance + " km...");
        } else {
            System.out.println("Cannot drive. Car is not started.");
        }
    }
}
