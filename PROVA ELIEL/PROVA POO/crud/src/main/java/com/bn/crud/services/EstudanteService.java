package com.bn.crud.services;


import com.bn.crud.entity.Estudantes;
import com.bn.crud.repositories.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudanteService {

    @Autowired
    private EstudanteRepository estudanteRepository;

    public List<Estudantes> listar(){
        return  estudanteRepository.findAll();
    }

    public Estudantes criarEstudante(Estudantes estudantes ){
        return  estudanteRepository.save(estudantes);
    }

    public Optional<Estudantes> listarEstudante(Long id){
        return estudanteRepository.findById(id);
    }

    public void delete (Long id){
        estudanteRepository.deleteById(id);
    }
}
