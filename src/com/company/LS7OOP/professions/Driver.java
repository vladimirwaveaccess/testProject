package com.company.LS7OOP.professions;

import java.util.Objects;

public class Driver {
    private int experience;

    public Driver(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return experience == driver.experience;
    }

    @Override
    public int hashCode() {
        return Objects.hash(experience);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "experience=" + experience +
                '}';
    }
}
