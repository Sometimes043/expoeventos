package com.exemplo.conferenceapp.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "tbl_session")
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer session_id;

    private String session_title;
    private LocalDate session_start_date;
    private LocalTime session_start_time;

    @ManyToOne
    @JoinColumn(name = "conf_id")
    private Conference conference;

    @OneToMany(mappedBy = "session", cascade = CascadeType.ALL)
    private List<Subscription> subscriptions;

    public Integer getSession_id()
     {return session_id;}

    public void setSession_id(Integer session_id)
     {this.session_id = session_id;}

    public String getSession_title()
     {return session_title;}

    public void setSession_title(String session_title)
     {this.session_title = session_title;}

    public LocalDate getSession_start_date()
     {return session_start_date;}

    public void setSession_start_date(LocalDate session_start_date)
     {this.session_start_date = session_start_date;}

    public LocalTime getSession_start_time() 
    {return session_start_time;}

    public void setSession_start_time(LocalTime session_start_time)
     {this.session_start_time = session_start_time;}

    public Conference getConference() 
    {return conference;}

    public void setConference(Conference conference) 
    {this.conference = conference;}

    public List<Subscription> getSubscriptions() 
    {return subscriptions;}

    public void setSubscriptions(List<Subscription> subscriptions) 
    {this.subscriptions = subscriptions;}
}
