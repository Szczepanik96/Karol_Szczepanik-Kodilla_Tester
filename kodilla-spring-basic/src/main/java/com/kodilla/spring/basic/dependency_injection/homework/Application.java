package com.kodilla.spring.basic.dependency_injection.homework;
public class Application {

    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService() {
            @Override
            public boolean deliverPackage(String address, double weight) {
                return DeliveryService.super.deliverPackage(address, weight);
            }
        };
        NotificationService notificationService = new NotificationService() {
            @Override
            public void success(String address) {
                NotificationService.super.success(address);
            }

            @Override
            public void fail(String address) {
                NotificationService.super.fail(address);
            }
        };
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService,notificationService);
        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);
    }
}