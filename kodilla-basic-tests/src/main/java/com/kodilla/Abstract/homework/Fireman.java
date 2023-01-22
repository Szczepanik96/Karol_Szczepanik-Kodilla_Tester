package com.kodilla.Abstract.homework;

public class Fireman extends Job{

    public final double salary;
    public final String responsibilities;

    public Fireman(double salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    @Override
    public double salary() {
        return this.salary;
    }

    @Override
    public String responsibilities() {
        return this.responsibilities;
    }
}
