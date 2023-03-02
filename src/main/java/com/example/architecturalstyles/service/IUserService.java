package com.example.architecturalstyles.service;

import com.example.architecturalstyles.entities.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    Optional<User> getUserByEmail(String email);
    List<User> getAllUsersFromDB();
    User saveUser(User user) throws Exception;
    User updateUser(String id, User user);
    void deleteUserById(String id);
}
