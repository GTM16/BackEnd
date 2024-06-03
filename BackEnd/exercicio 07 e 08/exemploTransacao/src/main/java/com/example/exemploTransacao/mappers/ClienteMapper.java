package com.example.exemploTransacao.mappers;

import com.example.exemploTransacao.dtos.ClienteDto;
import com.example.exemploTransacao.models.ClienteModel;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapper {
    public ClienteDto toDto(ClienteModel cliente) {
        ClienteDto clienteDto = new ClienteDto(
                cliente.getNome(),
                cliente.getSaldo(),
                cliente.getSenha()
        );
        return clienteDto;
    }
}
