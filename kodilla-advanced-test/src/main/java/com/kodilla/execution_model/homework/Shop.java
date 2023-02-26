package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    private List<Order> shopList = new ArrayList<>();

       public void addOrder(Order order) {
        this.shopList.add(order);
    }

    public double getValueOfAllOrders(){
        return shopList.stream()
                .mapToDouble(Order::getPrice)
                .sum();
    }

    public int getNumberOfOrders() {
        return shopList.size();
    }

    public List<Order> getRangeOfOrdersByDate(LocalDate startDate, LocalDate endDate) {
        return shopList.stream()
                .filter(order -> {
                    LocalDate orderDate = order.getLocalDate();
                    return !orderDate.isBefore(startDate) && !orderDate.isAfter(endDate);
                })
                .collect(Collectors.toList());
    }
    public List<Order> getRangeOfOrdersByPrice(double minAmount,double maxAmount){
        return shopList.stream()
                .filter(order -> order.getPrice() >= minAmount && order.getPrice() <= maxAmount)
                .collect(Collectors.toList());
    }
}