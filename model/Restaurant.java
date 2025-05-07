package com.example.restaurantreviews.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component

public class Restaurant {
    private String name;
    private String location;
    private int rating;
    private boolean delivery;
    private int price;
}
