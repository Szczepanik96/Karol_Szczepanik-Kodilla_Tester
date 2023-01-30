package com.kodilla.collections.interfaces.homework;

public class Mustang implements Car{

    private double speed;

    public Mustang(double speed){
        this.speed = speed;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public double increaseSpeed() {
        return speed + 20.0;

    }

    @Override
    public double decreaseSpeed() {
        return speed - 30.0;

    }
}
