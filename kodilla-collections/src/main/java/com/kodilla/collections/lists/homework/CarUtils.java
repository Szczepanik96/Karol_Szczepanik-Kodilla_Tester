package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Daewoo;
import com.kodilla.collections.interfaces.homework.Mustang;
import com.kodilla.collections.interfaces.homework.Porsche;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car name: " + getCarName(car));
        System.out.println("Actual car speed is: " + car.getSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof Daewoo)
            return "Daewoo";
        else if (car instanceof Mustang)
            return "Mustang";
        else if (car instanceof Porsche)
            return "Porsche";
        else
            return "Unknown car name";
    }
}