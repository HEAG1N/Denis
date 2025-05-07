package com.example.restaurantreviews.repository;
import com.example.restaurantreviews.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {
    private final List<User> users = new ArrayList<>();

//    public UserRepository() {
//        users.add(new User(User("anamodarca", "modarca@yahoo.com", 19, 500.75, false, review2, restaurant2));
//    }

    public List<User> findAll() {
        return users;
    }

    public Optional<User> findById(int index) {
        return index >= 0 && index < users.size() ? Optional.of(users.get(index)) : Optional.empty();
    }

    public void save(User user) {
        users.add(user);
    }

    public void update(int index, User updatedUser) {
        if (index >= 0 && index < users.size()) {
            users.set(index, updatedUser);
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < users.size()) {
            users.remove(index);
        }
    }
}