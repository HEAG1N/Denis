package com.example.restaurantreviews.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Review {
    private String author;
    private int stars;
    private String comment;
    private String title;
    private String date;
}
