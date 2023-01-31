package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Daewoo;
import com.kodilla.collections.interfaces.homework.Mustang;
import com.kodilla.collections.interfaces.homework.Porsche;

import java.util.Random;

public class CarListApplication {

    public static void main(String[] args) {
        Car[] cars = new Car[3];
        for (int i = 0; i < cars.length; i++)
            cars[i] = createCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car createCar() {
        Random random = new Random();
        int createCarKind = random.nextInt(3);

        int speed = random.nextInt(260);

        if (createCarKind == 0)
            return new Daewoo(speed);

        else if (createCarKind == 1)
            return new Mustang(speed);
        else
            return new Porsche(speed);
    }
}