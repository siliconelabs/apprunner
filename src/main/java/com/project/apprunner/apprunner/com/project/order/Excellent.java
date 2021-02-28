package com.project.apprunner.apprunner.com.project.order;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class Excellent implements Rating {
    public Excellent() {
        System.out.println("order1");
    }

    @Override
    public int getRating() {
        System.out.println("order1");
        return 1;
    }
}


