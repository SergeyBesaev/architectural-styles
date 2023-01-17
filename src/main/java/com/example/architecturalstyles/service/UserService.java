package com.example.architecturalstyles.service;

import com.example.architecturalstyles.entities.User;
import com.example.architecturalstyles.repo.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService implements IUserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User getUserById(String id) {
        return repo.getReferenceById(UUID.fromString(id));
    }

    public List<User> getAllUsersFromDB() {
        return repo.findAll();
    }

    public User saveUser(User user) {
        User savedUser = repo.save(user);
        return savedUser;
    }

}
