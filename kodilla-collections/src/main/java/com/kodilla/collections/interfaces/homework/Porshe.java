package com.kodilla.collections.interfaces.homework;

public class Porshe implements Car{

    private double speed;

    public Porshe(double speed){
        this.speed = speed;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public double increaseSpeed() {
        return speed * 2.5;

    }

    @Override
    public double decreaseSpeed() {
        return speed/3.0;

    }
}
