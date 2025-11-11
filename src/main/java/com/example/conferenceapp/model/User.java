package com.exemplo.conferenceapp.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbl_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;

    private String user_name;
    private String user_email;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Subscription> subscriptions;

    public Integer getUser_id()
     {return user_id;}

    public void setUser_id(Integer user_id)
     {this.user_id = user_id;}

    public String getUser_name()
     {return user_name;}

    public void setUser_name(String user_name)
     {this.user_name = user_name;}

    public String getUser_email() 
    {return user_email;}

    public void setUser_email(String user_email)
     {this.user_email = user_email;}

    public List<Subscription> getSubscriptions()
     {return subscriptions;}

    public void setSubscriptions(List<Subscription> subscriptions)
     {this.subscriptions = subscriptions;}
}
