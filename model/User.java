package com.example.restaurantreviews.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Data
@NoArgsConstructor
@AllArgsConstructor

@Component
public class User {
    private String username;
    private String email;
    private int age;
    private double spending;
    private boolean verified;
    private Review review;
    private Restaurant restaurant;
    @Autowired
    public void setReview(Review review) {
        this.review = review;
    }
    @Autowired
    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}