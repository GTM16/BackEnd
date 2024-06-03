package com.example.exerc9.repositories;

import com.example.exerc9.models.FilmeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface FilmeRepository extends JpaRepository<FilmeModel, Long> {
    Optional<FilmeModel> findByTitulo(String titulo);
}

