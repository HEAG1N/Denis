package com.example.restaurantreviews.service;
import com.example.restaurantreviews.model.User;
import com.example.restaurantreviews.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(int index) {
        return userRepository.findById(index);
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public void updateUser(int index, User review) {
        userRepository.update(index, review);
    }

    public void deleteUser(int index) {
        userRepository.delete(index);
    }
}