package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com/kodilla/spring/basic/spring_dependency_injection/homework");
    Calculator bean = context.getBean(Calculator.class);

    @Test
    public void shouldReturnCorrectResultOfAdd(){
        double addResult = bean.add(12.3,41.8);
        Assertions.assertNotNull(addResult);
    }

    @Test
    public void shouldReturnCorrectResultOfSubtract(){
        double subResult = bean.subtract(83.1,80.1);
        Assertions.assertNotNull(subResult);
    }

    @Test
    public void shouldReturnCorrectResultOfMultiply(){
        double multiplyResult = bean.multiply(12.5,29.5);
        Assertions.assertNotNull(multiplyResult);
    }

    @Test
    public void shouldReturnCorrectResultOfDivide(){
        double divideResult = bean.divide(80.5,11.2);
        Assertions.assertNotNull(divideResult);
    }
}