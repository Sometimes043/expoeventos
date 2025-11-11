package com.exemplo.conferenceapp.service;

import com.exemplo.conferenceapp.model.Conference;
import com.exemplo.conferenceapp.repository.ConferenceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConferenceService {
    private final ConferenceRepository repo;

    public ConferenceService(ConferenceRepository repo) 
    {this.repo = repo;}

    public List<Conference> listarTodos()
     {return repo.findAll();}

    public Conference salvar(Conference c) 
    {return repo.save(c);}

    public Optional<Conference> buscar(Integer id) 
    {return repo.findById(id);}

    public void deletar(Integer id) 
    {repo.deleteById(id);}
}
