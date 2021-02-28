package com.project.apprunner.apprunner.com.project.order;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
class Good implements Rating {
    public Good() {
        System.out.println("order2");
    }

    @Override
    public int getRating() {
        System.out.println("order2");
        return 2;
    }
}