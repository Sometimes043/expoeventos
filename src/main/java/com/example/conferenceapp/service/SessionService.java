package com.exemplo.conferenceapp.service;

import com.exemplo.conferenceapp.model.Session;
import com.exemplo.conferenceapp.repository.SessionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SessionService {
    private final SessionRepository repo;

    public SessionService(SessionRepository repo)
     {this.repo = repo;}

    public List<Session> listarTodos() 
    {return repo.findAll();}

    public Session salvar(Session s) 
    {return repo.save(s);}

    public Optional<Session> buscar(Integer id) 
    {return repo.findById(id);}

    public void deletar(Integer id) 
    {repo.deleteById(id);}
}
