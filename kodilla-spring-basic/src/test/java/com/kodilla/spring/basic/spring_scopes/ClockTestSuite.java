package com.kodilla.spring.basic.spring_scopes;

import com.kodilla.spring.basic.spring_scopes.homework.Clock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ClockTestSuite {
    private ApplicationContext context;
    private Clock firstBean;
    private Clock secondBean;
    private Clock thirdBean;
    private Clock fourthBean;

    @BeforeEach
    public void setUpContext() {
        context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_scopes.homework");
        firstBean = context.getBean(Clock.class);
        secondBean = context.getBean(Clock.class);
        thirdBean = context.getBean(Clock.class);
        fourthBean = context.getBean(Clock.class);
    }

    @Test
    public void shouldReturnDifferentTimeInBeans(){
        Assertions.assertNotEquals(firstBean, secondBean);
        Assertions.assertNotEquals(secondBean, thirdBean);
        Assertions.assertNotEquals(firstBean, thirdBean);
        Assertions.assertNotEquals(firstBean,fourthBean);
        Assertions.assertNotEquals(secondBean,fourthBean);
        Assertions.assertNotEquals(thirdBean,fourthBean);
    }
}