package com.example.restaurantreviews.repository;

import com.example.restaurantreviews.model.Review;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ReviewRepository {
    private final List<Review> reviews = new ArrayList<>();

    public ReviewRepository() {
        reviews.add(new Review("Max Lavrov", 5, "Un loc foarte linistit", "Atmosfera placuta", "2004-02-14"));
    }

    public List<Review> findAll() {
        return reviews;
    }

    public Optional<Review> findById(int index) {
        return index >= 0 && index < reviews.size() ? Optional.of(reviews.get(index)) : Optional.empty();
    }

    public void save(Review review) {
        reviews.add(review);
    }

    public void update(int index, Review updatedReview) {
        if (index >= 0 && index < reviews.size()) {
            reviews.set(index, updatedReview);
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < reviews.size()) {
            reviews.remove(index);
        }
    }
}