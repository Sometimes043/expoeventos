package com.exemplo.conferenceapp.controller;

import com.exemplo.conferenceapp.model.Session;
import com.exemplo.conferenceapp.service.SessionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sessions")
public class SessionController {
    private final SessionService service;
    public SessionController(SessionService service)
     {this.service = service;}

    @GetMapping
    public List<Session> listarTodos() 
    {return service.listarTodos();}

    @GetMapping("/{id}")
    public ResponseEntity<Session> buscar(@PathVariable Integer id) {
        return service.buscar(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Session criar(@RequestBody Session s)
     {return service.salvar(s);}

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
