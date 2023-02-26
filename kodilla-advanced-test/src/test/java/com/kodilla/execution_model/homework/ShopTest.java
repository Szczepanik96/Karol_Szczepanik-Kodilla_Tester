package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {
    Shop shop = new Shop();
    List<Shop> shopList = new ArrayList<>();
    Order concrete = new Order(4500.50,LocalDate.of(2022,5,13),"Danny");
    Order cement = new Order(2800.90,LocalDate.of(2019,8,30),"Harry");
    Order sand = new Order(980.30,LocalDate.of(2021,6,12),"Ginny");
    Order bricks = new Order(3864.1,LocalDate.of(2012,9,3),"Helen");
    Order styrofoam = new Order(5032.12,LocalDate.of(2023,6,26),"David");

    @BeforeEach
    public void addOrdersToList(){
        shop.addOrder(concrete);
        shop.addOrder(cement);
        shop.addOrder(sand);
        shop.addOrder(bricks);
        shop.addOrder(styrofoam);
    }

    @Test
    public void shouldReturnNumberOfAllOrders(){
        int numberOfOrders = shop.getNumberOfOrders();
        assertEquals(5,numberOfOrders);
    }
    @Test
    public void shouldReturnSumOfAllOrders(){
        double sumOfAllOrders = shop.getValueOfAllOrders();
        assertEquals(17177.92,sumOfAllOrders);
    }
    @Test
    public void shouldReturnOrdersTwoYearsPeriod(){
        LocalDate startDate = LocalDate.of(2020,1,1);
        LocalDate endDate = LocalDate.of(2022,1,1);
        List<Order> result = shop.getRangeOfOrdersByDate(startDate,endDate);

        assertEquals(Arrays.asList(sand),result);
    }
    @Test
    public void shouldReturnOrdersFromPriceRange(){
        double minAmount = 2000.0;
        double maxAmount = 3500.0;
        List<Order> result = shop.getRangeOfOrdersByPrice(minAmount,maxAmount);

        assertEquals(Arrays.asList(cement),result);
    }
}