package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int publicationDate;

    public OperatingSystem(int publicationSystemDate){

        this.publicationDate = publicationSystemDate;
    }

    public void turnOn() {
        System.out.println("The system is turning on");
    }

    public void turnOff() {
        System.out.println("The system is turning off");
    }

    public int getYear(){
        return publicationDate;
    }
}