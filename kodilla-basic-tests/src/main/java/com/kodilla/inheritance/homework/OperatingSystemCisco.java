package com.kodilla.inheritance.homework;

public class OperatingSystemCisco extends OperatingSystem {

    public void saySorryCisco() {
        System.out.println("Sorry!");
    }

    public OperatingSystemCisco(int publicationSystemDate){
        super(publicationSystemDate);
        System.out.println("Cisco constructor");
    }
}