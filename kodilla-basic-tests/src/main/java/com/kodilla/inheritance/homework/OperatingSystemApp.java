package com.kodilla.inheritance.homework;

public class OperatingSystemApp {

    public static void main(String[] args) {


        OperatingSystem operatingSystem = new OperatingSystem(2023);
        operatingSystem.turnOn();
        System.out.println((operatingSystem.getYear()));


        OperatingSystemCisco operatingSystemCisco = new OperatingSystemCisco(1984);
        operatingSystemCisco.saySorryCisco();
        operatingSystemCisco.turnOff();
        System.out.println((operatingSystem.getYear()));


        OperatingSystemLinux operatingSystemLinux = new OperatingSystemLinux(1991);
        operatingSystemLinux.turnOn();
        operatingSystemLinux.penguin();
        System.out.println((operatingSystemLinux.getYear()));

    }
}