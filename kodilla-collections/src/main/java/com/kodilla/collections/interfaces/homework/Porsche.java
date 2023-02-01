package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Porsche implements Car{

    private double speed;

    public Porsche(double speed){
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Porsche porsche = (Porsche) o;
        return Double.compare(porsche.speed, speed) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
