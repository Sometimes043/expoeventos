package com.exemplo.conferenceapp.service;

import com.exemplo.conferenceapp.model.User;
import com.exemplo.conferenceapp.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository repo;

    public UserService(UserRepository repo) 
    {this.repo = repo;}

    public List<User> listarTodos() 
    {return repo.findAll();}

    public User salvar(User u) 
    {return repo.save(u);}

    public Optional<User> buscar(Integer id) 
    {return repo.findById(id);}

    public void deletar(Integer id) 
    {repo.deleteById(id);}
}
