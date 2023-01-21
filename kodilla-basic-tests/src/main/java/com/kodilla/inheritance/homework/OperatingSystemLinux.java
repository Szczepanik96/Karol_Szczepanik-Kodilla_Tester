package com.kodilla.inheritance.homework;

public class OperatingSystemLinux extends OperatingSystem {

    public OperatingSystemLinux(int publicationSystemDate){
        super( publicationSystemDate);
        System.out.println("Linux constructor");
    }

    public void penguin(){
        System.out.println("Expensive penguin");
    }
}