package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CarApplicationTestSuite {

    @Autowired
    private CarApplication carApplication;
    @Test
    public void shouldReturnCorrectCar() {
        CarApplication carApplication = new CarApplication();
//        Car car = carApplication.getCarAccordingToWeather();
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean("getCarAccordingToWeather");
        Car details = carApplication.getCarAccordingToWeather();
        System.out.println(details);
    }
}
