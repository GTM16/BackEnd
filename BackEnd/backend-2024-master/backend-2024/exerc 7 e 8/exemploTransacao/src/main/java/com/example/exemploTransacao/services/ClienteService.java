package com.example.exemploTransacao.services;

import com.example.exemploTransacao.dtos.ClienteDto;
import com.example.exemploTransacao.mappers.ClienteMapper;
import com.example.exemploTransacao.models.ClienteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    @Autowired
    ClienteMapper clienteMapper;

    public ClienteDto getCliente(){
        ClienteModel cliente = new ClienteModel("Angelo", 100.0, "123456");
        return clienteMapper.toDto(cliente);
    };
}
