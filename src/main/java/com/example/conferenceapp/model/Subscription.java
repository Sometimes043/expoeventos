package com.exemplo.conferenceapp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_subscription")
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer subscription_id;

    @ManyToOne
    @JoinColumn(name = "subscribed_user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "event_session_id")
    private Session session;

    public Integer getSubscription_id() { return subscription_id; }
    public void setSubscription_id(Integer subscription_id) { this.subscription_id = subscription_id; }
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
    public Session getSession() { return session; }
    public void setSession(Session session) { this.session = session; }
}
