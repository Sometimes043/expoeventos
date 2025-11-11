package com.exemplo.conferenceapp.controller;

import com.exemplo.conferenceapp.model.Subscription;
import com.exemplo.conferenceapp.service.SubscriptionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subscriptions")
public class SubscriptionController {
    private final SubscriptionService service;
    public SubscriptionController(SubscriptionService service)
     {this.service = service;}

    @GetMapping
    public List<Subscription> listarTodos() 
    {return service.listarTodos();}

    @GetMapping("/{id}")
    public ResponseEntity<Subscription> buscar(@PathVariable Integer id) {
        return service.buscar(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Subscription criar(@RequestBody Subscription s)
     {return service.salvar(s);}

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
