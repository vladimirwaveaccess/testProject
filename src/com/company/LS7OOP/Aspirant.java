package com.company.LS7OOP;

import java.util.Objects;

public class Aspirant extends Student {
    private String scienceWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scienceWork) {
        super(firstName, lastName, group, averageMark);
        this.scienceWork = scienceWork;
    }

    public Aspirant(String scienceWork) {
        this.scienceWork = scienceWork;
    }

    public String getScienceWork() {
        return scienceWork;
    }

    public void setScienceWork(String scienceWork) {
        this.scienceWork = scienceWork;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Aspirant aspirant = (Aspirant) o;
        return Objects.equals(scienceWork, aspirant.scienceWork);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), scienceWork);
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "scienceWork='" + scienceWork + '\'' +
                "} " + super.toString();
    }

    @Override
    public int getScholarship() {
        return getAverageMark() == 5 ? 200 : 180;
    }
}
