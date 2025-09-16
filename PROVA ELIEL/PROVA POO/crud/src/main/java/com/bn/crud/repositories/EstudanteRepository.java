package com.bn.crud.repositories;

import com.bn.crud.entity.Estudantes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<Estudantes, Long> {
}
