package com.company.LS7OOP.vehicles;

import com.company.LS7OOP.details.Engine;
import com.company.LS7OOP.professions.Person;

import java.util.Objects;

public class Car {
    private String marka;
    private String carClass;
    private double weight;
    private Person driver;
    private Engine engine;

    public Car(String marka, String carClass, double weight, Engine engine) {
        this.marka = marka;
        this.carClass = carClass;
        this.weight = weight;
        this.engine = engine;
    }

    public Car(String marka, String carClass, double weight, Person driver, Engine engine) {
        this(marka, carClass, weight, engine);
        this.driver = driver;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Person getDriver() {
        return driver;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.weight, weight) == 0 &&
                Objects.equals(marka, car.marka) &&
                Objects.equals(carClass, car.carClass) &&
                Objects.equals(driver, car.driver) &&
                Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marka, carClass, weight, driver, engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", car class ='" + carClass + '\'' +
                ", weight car =" + weight +
                ", driver car =" + driver +
                ", engine car =" + engine +
                '}';
    }

    public void start() {
        System.out.println("Let's go");
    }

    public void stop() {
        System.out.println("STOP");
    }

    public void turnRight() {
        System.out.println("Turn right");
    }

    public void turnLeft() {
        System.out.println("Turn left");
    }

    public void printInfo() {
        System.out.println("Information about car:");
        System.out.println(this.toString());
    }
}
