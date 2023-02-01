package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mustang mustang = (Mustang) o;
        return Double.compare(mustang.speed, speed) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
