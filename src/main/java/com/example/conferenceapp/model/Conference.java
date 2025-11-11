package com.exemplo.conferenceapp.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbl_conference")
public class Conference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer conf_id;

    private String conf_name;
    private String conf_address;

    @OneToMany(mappedBy = "conference", cascade = CascadeType.ALL)
    private List<Session> sessions;

    public Integer getConf_id()
     {return conf_id;}

    public void setConf_id(Integer conf_id)
     {this.conf_id = conf_id;}

    public String getConf_name() 
    {return conf_name;}

    public void setConf_name(String conf_name)
     {this.conf_name = conf_name;}
    public String getConf_address()
     {return conf_address;}
    public void setConf_address(String conf_address)
     {this.conf_address = conf_address;}
    public List<Session> getSessions()
     {return sessions;}
    public void setSessions(List<Session> sessions)
     {this.sessions = sessions;}
}
