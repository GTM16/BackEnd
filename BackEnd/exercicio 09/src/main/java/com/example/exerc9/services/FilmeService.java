package com.example.exerc9.services;

import com.example.exerc9.dtos.FilmeRequestDTO;
import com.example.exerc9.dtos.FilmeResponseDTO;
import com.example.exerc9.models.FilmeModel;
import com.example.exerc9.repositories.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FilmeService {
    @Autowired
    private FilmeRepository filmeRepository;

    public FilmeResponseDTO createFilme(FilmeRequestDTO filmeRequestDTO) {
        FilmeModel filme = new FilmeModel();
        filme.setTitulo(filmeRequestDTO.titulo());
        filme.setDiretor(filmeRequestDTO.diretor());
        filme.setAno(filmeRequestDTO.ano());
        FilmeModel savedFilme = filmeRepository.save(filme);
        return toResponseDTO(savedFilme);
    }

    public FilmeResponseDTO getFilmeById(Long id) {
        Optional<FilmeModel> filmeOptional = filmeRepository.findById(id);
        return filmeOptional.map(this::toResponseDTO).orElse(null);
    }

    public List<FilmeResponseDTO> getAllFilmes() {
        List<FilmeModel> filmes = filmeRepository.findAll();
        return filmes.stream().map(this::toResponseDTO).collect(Collectors.toList());
    }

    public FilmeResponseDTO updateFilme(Long id, FilmeRequestDTO filmeRequestDTO) {
        Optional<FilmeModel> filmeOptional = filmeRepository.findById(id);
        if (filmeOptional.isPresent()) {
            FilmeModel filme = filmeOptional.get();
            filme.setTitulo(filmeRequestDTO.titulo());
            filme.setDiretor(filmeRequestDTO.diretor());
            filme.setAno(filmeRequestDTO.ano());
            FilmeModel updatedFilme = filmeRepository.save(filme);
            return toResponseDTO(updatedFilme);
        }
        return null;
    }

    public void deleteFilme(Long id) {
        filmeRepository.deleteById(id);
    }

    public FilmeResponseDTO getFilmeByTitulo(String titulo) {
        Optional<FilmeModel> filmeOptional = filmeRepository.findByTitulo(titulo);
        return filmeOptional.map(this::toResponseDTO).orElse(null);
    }

    private FilmeResponseDTO toResponseDTO(FilmeModel filme) {
        return new FilmeResponseDTO(filme.getId(), filme.getTitulo(), filme.getDiretor(), filme.getAno());
    }
}
