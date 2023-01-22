package com.kodilla.Abstract.homework;

public class Policeman extends Job {

    private final double salary;

    final String responsibilities;

    public Policeman(double salary, String responsibilities) {
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
