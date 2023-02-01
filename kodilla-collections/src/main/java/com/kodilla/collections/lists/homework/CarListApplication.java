package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Daewoo;
import com.kodilla.collections.interfaces.homework.Mustang;
import com.kodilla.collections.interfaces.homework.Porsche;

import java.util.ArrayList;
import java.util.List;


public class CarListApplication {
    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();

        carList.add(new Daewoo(10));
        carList.add(new Mustang(30));
        carList.add(new Porsche(100));

        Porsche porsche = (new Porsche(100));

        carList.remove(porsche);
        carList.remove(0);

        System.out.println("Models, details and number of cars: " + carList.size());

        for (Car car : carList) {
            CarUtils.describeCar(car);
        }
    }
}