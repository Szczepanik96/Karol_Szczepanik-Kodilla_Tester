package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Daewoo daewoo = (Daewoo) o;
        return Double.compare(daewoo.speed, speed) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
