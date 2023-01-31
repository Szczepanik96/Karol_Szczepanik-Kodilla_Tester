package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {

        Car mustang = new Mustang(55);
        doRace(mustang);

        Car porshe = new Porsche(80);
        doRace(porshe);

        Car deawoo = new Daewoo(25);
        doRace(deawoo);
    }

    public static void doRace(Car car) {
        System.out.println(car.decreaseSpeed() * 3 + car.increaseSpeed() * 2 + car.getSpeed());
    }
}
