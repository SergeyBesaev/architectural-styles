package com.example.architecturalstyles.repo;

import com.example.architecturalstyles.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

/**
 * TODO Repository должен возвращать класс Optional
 */

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

    Optional<User> findByEmail(String email);

}
