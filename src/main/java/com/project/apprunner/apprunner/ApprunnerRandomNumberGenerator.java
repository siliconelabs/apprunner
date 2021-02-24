package com.project.apprunner.apprunner;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.Random;
import java.util.stream.IntStream;

@Configuration
public class ApprunnerRandomNumberGenerator {

    @Bean
    @Order(2)
    public ApplicationRunner runRandomGenerator()
    {
        Random random=new Random();
        System.out.println("run Random generator calıstı");
        return args -> IntStream.generate(()-> random.nextInt(100)).limit(10).forEach(System.out::println);
    }


}
