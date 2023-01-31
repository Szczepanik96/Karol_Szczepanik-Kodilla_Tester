package com.kodilla.collections.interfaces.homework;

public class Daewoo implements Car{

    private double speed;

    public Daewoo(double speed){
        this.speed = speed;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public double increaseSpeed() {
        return speed * 1.1;
    }

    @Override
    public double decreaseSpeed() {
        return speed / 1.5;
    }
}
