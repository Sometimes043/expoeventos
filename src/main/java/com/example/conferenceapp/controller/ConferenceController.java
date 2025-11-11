package com.exemplo.conferenceapp.controller;

import com.exemplo.conferenceapp.model.Conference;
import com.exemplo.conferenceapp.service.ConferenceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conferences")
public class ConferenceController {
    private final ConferenceService service;
    public ConferenceController(ConferenceService service)
     {this.service = service;}

    @GetMapping
    public List<Conference> listarTodos() 
    {return service.listarTodos();}

    @GetMapping("/{id}")
    public ResponseEntity<Conference> buscar(@PathVariable Integer id) {
        return service.buscar(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Conference criar(@RequestBody Conference c)
     {return service.salvar(c);}

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
