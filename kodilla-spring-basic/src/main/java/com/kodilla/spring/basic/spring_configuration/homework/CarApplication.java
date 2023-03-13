package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class CarApplication {

    @Bean
    public Car getCarAccordingToWeather() {

        LocalDate now = LocalDate.now();
        LocalDate springStart = LocalDate.of(now.getYear(), Month.MARCH, 20);
        LocalDate summerStart = LocalDate.of(now.getYear(), Month.JUNE, 21);
        LocalDate autumnStart = LocalDate.of(now.getYear(), Month.SEPTEMBER, 22);
        LocalDate winterStart = LocalDate.of(now.getYear(), Month.DECEMBER, 21);

        if (now.isAfter(winterStart) || now.isBefore(springStart)) {
            return new SUV();

        } else if (now.isAfter(springStart) && now.isBefore(summerStart)) {
            return new Sedan();

        } else if (now.isAfter(summerStart) && now.isBefore(autumnStart)) {
            return new Cabrio();

        } else {
            return new Sedan();
        }
    }
}


