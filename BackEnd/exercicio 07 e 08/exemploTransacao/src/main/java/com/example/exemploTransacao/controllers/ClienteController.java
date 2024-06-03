package com.example.exemploTransacao.controllers;

import com.example.exemploTransacao.dtos.ClienteDto;
import com.example.exemploTransacao.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping("/cliente/{nome}")
    public ResponseEntity<Object> getCliente() {
        String nome = "Angelo";
        Double saldo = 100.0;

        return ResponseEntity.status(HttpStatus.OK).body(new ClienteDto(nome, saldo, null));
    }
}

