package com.exemplo.conferenceapp.repository;

import com.exemplo.conferenceapp.model.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferenceRepository extends JpaRepository<Conference, Integer> {
}
