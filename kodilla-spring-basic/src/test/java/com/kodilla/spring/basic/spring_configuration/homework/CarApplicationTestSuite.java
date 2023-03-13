//package com.kodilla.spring.basic.spring_configuration.homework;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import java.time.LocalDate;
//import java.time.Month;
//import java.util.Arrays;
//import java.util.List;
//
//import static org.junit.Assert.assertTrue;
//
//@SpringBootTest
//public class CarApplicationTestSuite {
//
//    @Autowired
//    private Car car;
//
//    private Car getCarAccordingToWeather() {
//        CarApplication carApplication = new CarApplication();
//        return carApplication.getCarAccordingToWeather();
//    }
//
//    @Test
//    public void shouldReturnSuvDuringTheWinter() {
//
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
//        Car suv = (Car) context.getBean("getCarAccordingToWeather");
//        String carBody = suv.getCarType();
//        System.out.println("BodyType: " + carBody + " Local Date: " + LocalDate.now());
//        List<String> carPossibleBodies = Arrays.asList("SUV", "Cabrio", "Sedan");
//
////        assertTrue(carPossibleBodies.contains(carBody));
//    }
//    @Test
//    public void testCabrioInAutumn() {
//        LocalDate date = LocalDate.of(2023, Month.OCTOBER, 1);
//        Car car = getCarAccordingToWeather(date);
//        assertTrue(car instanceof Cabrio);
//    }
//
//    @Test
//    public void testSedanInSummer() {
//        LocalDate date = LocalDate.of(2023, Month.JULY, 1);
//        Car car = getCarAccordingToWeather(date);
//        assertTrue(car instanceof Sedan);
//    }
//}
