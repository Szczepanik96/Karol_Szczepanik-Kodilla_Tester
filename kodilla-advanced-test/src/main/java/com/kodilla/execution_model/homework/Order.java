package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {
    private double price;
    private LocalDate dateOrder;
    private String customerLogin;

    public Order(double price, LocalDate dateOrder, String customerLogin) {
        this.price = price;
        this.dateOrder = dateOrder;
        this.customerLogin = customerLogin;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getDateOrder() {
        return dateOrder;
    }

    public String getCustomerLogin() {
        return customerLogin;
    }
    public LocalDate getLocalDate(){
        return dateOrder;
    }

    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                ", dateOrder=" + dateOrder +
                ", customerLogin='" + customerLogin + '\'' +
                '}';
    }
}