package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.lists.homework.CarApplication;

import java.util.Random;

import static com.kodilla.collections.lists.homework.CarUtils.describeCar;

public class CarRandomArray {
    static Random random = new Random();

    public static void main(String[] args) {

        Car[] carRng = new Car[random.nextInt(15) + 1];
        for (int i = 0; i < carRng.length; i++) {
            carRng[i] = CarApplication.createCar();
        }

        for (int j = 0; j < carRng.length; j++) {
            describeCar(carRng[j]);
        }
    }
}