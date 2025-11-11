package com.exemplo.conferenceapp.service;

import com.exemplo.conferenceapp.model.Subscription;
import com.exemplo.conferenceapp.repository.SubscriptionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubscriptionService {
    private final SubscriptionRepository repo;

    public SubscriptionService(SubscriptionRepository repo) 
    {this.repo = repo;}

    public List<Subscription> listarTodos() 
    {return repo.findAll();}

    public Subscription salvar(Subscription s) 
    {return repo.save(s);}

    public Optional<Subscription> buscar(Integer id) 
    {return repo.findById(id);}

    public void deletar(Integer id) 
    {repo.deleteById(id);}
}
