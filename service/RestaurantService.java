package com.example.restaurantreviews.service;

import com.example.restaurantreviews.model.Restaurant;
import com.example.restaurantreviews.repository.RestaurantRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService {
    private final RestaurantRepository restaurantRepository;

    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    public Optional<Restaurant> getRestaurantById(int index) {
        return restaurantRepository.findById(index);
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurantRepository.save(restaurant);
    }

    public void updateRestaurant(int index, Restaurant restaurant) {
        restaurantRepository.update(index, restaurant);
    }

    public void deleteRestaurant(int index) {
        restaurantRepository.delete(index);
    }
}