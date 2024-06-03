package com.example.demo.controller;

import com.example.demo.jogador.Jogador;
import com.example.demo.jogador.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller{

    @Autowired
    private Service service;

    @GetMapping("/jogador")
    public ResponseEntity<Object> jogador() {
        try {
            Jogador jogador = new Jogador();
            Service.NewJogador(jogador);
            String frase = this.service.GerarFraseDoJogador(jogador);
            return ResponseEntity.ok().body(frase);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Erro ao gerar o jogador: " + e.getMessage());
        }
    }
}
