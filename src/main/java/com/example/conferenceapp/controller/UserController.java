package com.exemplo.conferenceapp.controller;

import com.exemplo.conferenceapp.model.User;
import com.exemplo.conferenceapp.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService service;
    public UserController(UserService service)
     {this.service = service;}

    @GetMapping
    public List<User> listarTodos()
     {return service.listarTodos();}

    @GetMapping("/{id}")
    public ResponseEntity<User> buscar(@PathVariable Integer id) {
        return service.buscar(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public User criar(@RequestBody User user)
     {return service.salvar(user);}

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
