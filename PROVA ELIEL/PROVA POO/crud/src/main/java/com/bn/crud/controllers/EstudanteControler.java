package com.bn.crud.controllers;

import com.bn.crud.entity.Estudantes;
import com.bn.crud.services.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/estudantes")
public class EstudanteControler {


    @Autowired
    private EstudanteService estudantesService;

    @GetMapping
    private List<Estudantes> estudantes(@PathVariable Long ID) {
        return estudantesService.listar();
    }

    @GetMapping("/buscar")
    public Optional<Estudantes> findAll(Long id){
        return estudantesService.listarEstudante(id);
    }

    @PostMapping
    public Estudantes criar( @RequestBody Estudantes estudantes){
        return estudantesService.criarEstudante(estudantes);
    }

    @DeleteMapping
    public void delete(Long id) {
        estudantesService.delete(id);
    }
}

