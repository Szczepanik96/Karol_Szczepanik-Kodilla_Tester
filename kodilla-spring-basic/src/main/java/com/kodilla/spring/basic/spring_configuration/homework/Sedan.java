package com.kodilla.spring.basic.spring_configuration.homework;

public class Sedan implements Car{
    @Override
    public Boolean hasHeadlightsTurnedOn() {
        return true;
    }

    @Override
    public String getCarType() {
        return "The car type is: Sedan";
    }
}
