package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Display {
    public double display(double value){
        System.out.println("The result is:" + value);
        return value;
    }
}