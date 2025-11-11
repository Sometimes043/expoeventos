package com.exemplo.conferenceapp.repository;

import com.exemplo.conferenceapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
