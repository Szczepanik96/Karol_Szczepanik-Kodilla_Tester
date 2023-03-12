package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;

@Configuration
public class CarApplication {


    @Bean
    public Car getCarAccordingToWeather(){
        Car car;
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH) +1;
        int hour = calendar.get(Calendar.HOUR_OF_DAY);

        if (month >= 6 && month <= 8) {
            car = new Cabrio();
        } else if (month >= 12 || month <= 2) {
            car = new SUV();
        } else {
            car = new Sedan();
        }

        if (hour >= 20 || hour < 6) {
            car.hasHeadlightsTurnedOn();
        }
        return car;
    }
}
