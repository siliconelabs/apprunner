package com.project.apprunner.apprunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.time.LocalDate;
import java.time.LocalTime;

@Configuration
public class AppRunnerDateTimeConfig {
    @Autowired
    public LocalTime time;
    //SPEL
    @Value("${userName23:userName}")
    String op;


    //ApplicationContext
    //spring container
    //ApplicationRunner

    @Bean
    public LocalTime runTime()
    {
        return LocalTime.now();
    }

    @Bean
    @Order(3)
    public ApplicationRunner runDisplayTime(LocalTime local)
    {

        System.out.printf("Now : %02d: %02d :%02d%n",local.getHour(),local.getMinute(),local.getSecond());
        System.out.println(op);

        System.out.println("runDis");
        return args->{
            LocalTime now=LocalTime.now();
            System.out.printf("Now : %02d: %02d :%02d%n",now.getHour(),now.getMinute(),now.getSecond());
        };
    }

    @Bean
    @Order(1)
    public ApplicationRunner runDisplayDate()
    {

        System.out.println("rundisplayDate");
        return args->{
            LocalDate date=LocalDate.now();
            System.out.printf("Today : %02d: %02d :%04d%n",date.getDayOfMonth(),date.getMonthValue(),date.getYear());
        };
    }
}
