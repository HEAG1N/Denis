package com.example.restaurantreviews;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:bean.xml")
public class RestaurantReviewsApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(RestaurantReviewsApplication.class, args);
        Restaurant restaurant3 = context.getBean("restaurant1", Restaurant.class);
        Review review3 = context.getBean("review1", Review.class);
        User user3 = context.getBean("user1", User.class);
        System.out.println(user3);
        System.out.println(restaurant3);
        System.out.println(review3);
    }
}
