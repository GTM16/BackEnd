package com.example.exerc9.controllers;

import com.example.exerc9.dtos.FilmeRequestDTO;
import com.example.exerc9.dtos.FilmeResponseDTO;
import com.example.exerc9.services.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/filmes")
public class FilmeController {
    @Autowired
    private FilmeService filmeService;

    @PostMapping
    public ResponseEntity<FilmeResponseDTO> createFilme(@RequestBody FilmeRequestDTO filmeRequestDTO) {
        FilmeResponseDTO filmeResponseDTO = filmeService.createFilme(filmeRequestDTO);
        return new ResponseEntity<>(filmeResponseDTO, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FilmeResponseDTO> getFilmeById(@PathVariable Long id) {
        FilmeResponseDTO filmeResponseDTO = filmeService.getFilmeById(id);
        if (filmeResponseDTO != null) {
            return new ResponseEntity<>(filmeResponseDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<FilmeResponseDTO>> getAllFilmes() {
        List<FilmeResponseDTO> filmes = filmeService.getAllFilmes();
        return new ResponseEntity<>(filmes, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<FilmeResponseDTO> updateFilme(@PathVariable Long id, @RequestBody FilmeRequestDTO filmeRequestDTO) {
        FilmeResponseDTO filmeResponseDTO = filmeService.updateFilme(id, filmeRequestDTO);
        if (filmeResponseDTO != null) {
            return new ResponseEntity<>(filmeResponseDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFilme(@PathVariable Long id) {
        filmeService.deleteFilme(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/titulo/{titulo}")
    public ResponseEntity<FilmeResponseDTO> getFilmeByTitulo(@PathVariable String titulo) {
        FilmeResponseDTO filmeResponseDTO = filmeService.getFilmeByTitulo(titulo);
        if (filmeResponseDTO != null) {
            return new ResponseEntity<>(filmeResponseDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
