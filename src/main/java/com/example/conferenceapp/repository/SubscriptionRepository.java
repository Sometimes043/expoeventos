package com.exemplo.conferenceapp.repository;

import com.exemplo.conferenceapp.model.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Integer> {
}
