package com.company.LS7OOP.details;

import java.util.Objects;

public class Engine {
    private double power;
    private String company;

    public Engine(double power, String manufacturer) {
        this.power = power;
        this.company = manufacturer;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Double.compare(engine.power, power) == 0 &&
                Objects.equals(company, engine.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, company);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", company='" + company + '\'' +
                '}';
    }
}
