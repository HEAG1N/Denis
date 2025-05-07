package com.example.restaurantreviews.service;
import com.example.restaurantreviews.model.Review;
import com.example.restaurantreviews.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public Optional<Review> getReviewById(int index) {
        return reviewRepository.findById(index);
    }

    public void addReview(Review review) {
        reviewRepository.save(review);
    }

    public void updateReview(int index, Review review) {
        reviewRepository.update(index, review);
    }

    public void deleteReview(int index) {
        reviewRepository.delete(index);
    }
}