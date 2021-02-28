package com.project.apprunner.apprunner;

import com.project.apprunner.apprunner.com.project.order.Rating;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class RatingRetrieveUser {

    @Autowired
    private List<Rating> ratings;

    @Test
    public void givenOrder_whenInjected_thenByOrderValue() {
        System.out.println(ratings.get(0).getRating());
       System.out.println(ratings.get(1).getRating());

    }
}
