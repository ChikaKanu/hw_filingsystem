package com.codeclan.example.filingsystem.repository;

import com.codeclan.example.filingsystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
