package com.example.restaurantreviews.repository;

import com.example.restaurantreviews.model.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class RestaurantRepository {
    private final List<Restaurant> restaurants = new ArrayList<>();

    public RestaurantRepository() {
        restaurants.add(new Restaurant("Claude Monet", "Rusia", 5, true, 500));
    }

    public List<Restaurant> findAll() {
        return restaurants;
    }

    public Optional<Restaurant> findById(int index) {
        return index >= 0 && index < restaurants.size() ? Optional.of(restaurants.get(index)) : Optional.empty();
    }

    public void save(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    public void update(int index, Restaurant updatedRestaurant) {
        if (index >= 0 && index < restaurants.size()) {
            restaurants.set(index, updatedRestaurant);
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < restaurants.size()) {
            restaurants.remove(index);
        }
    }
}