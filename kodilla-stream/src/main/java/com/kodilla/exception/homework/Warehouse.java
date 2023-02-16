package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {
    public static List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        List<Order> ordersList = orders
                .stream()
                .filter(order -> order.getNumber().equals(number))
                .collect(Collectors.toList());
        if (ordersList.isEmpty()) {
            throw new OrderDoesntExistException();
        }
        return ordersList.get(0);
    }
}